package ru.kogut.enterprise.service.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.kogut.enterprise.common.Answer;
import ru.kogut.enterprise.enums.Answers;
import ru.kogut.enterprise.model.security.UserEntity;
import ru.kogut.enterprise.repository.security.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Answer save(UserEntity user) {
        if (user == null) return new Answer(Answers.ERROR,"User is empty");
        if (userRepository.save(user) == null){
            return new Answer(Answers.ERROR, "Error save user");
        }
        return new Answer(Answers.OK);
    }

    @Override
    public Answer update(UserEntity user) {
        return save(user);
    }

    @Override
    public UserEntity getById(String id) {
        if (id.isEmpty()) return null;
        Optional<UserEntity> optionalUserEntity = userRepository.findById(id);
        return optionalUserEntity.get();
    }

    @Override
    public List<UserEntity> getAll() {
        return userRepository.findAll();
    }

    @Override
    public void delete(UserEntity user) {
        if (user == null) return;
        userRepository.delete(user);
    }

    @Override
    public UserEntity findByLoginAndPassword(String login, String password) {
        List<UserEntity> usersList = userRepository.findByLoginAndPassword(login, password);
        if (usersList.size() == 0) return null;
        return usersList.get(0);
    }

    @Override
    public void initUser(String login, String password, String userName, String eMail) {
        if (countByLogin(login) > 0) return;
        createUser(login, password, userName, eMail);
    }

    @Override
    public void createUser(String login, String password, String userName, String eMail) {
        final UserEntity user = new UserEntity();
        user.setLogin(login);
        user.setPassword(passwordEncoder.encode(password));
        user.setUserName(userName);
        user.seteMail(eMail);
        user.setDisabled(false);
        save(user);
    }

    @Override
    public long countByLogin(String login) {
        return userRepository.countByLogin(login);
    }

    @Override
    public long countByEMail(String eMail) {
        return userRepository.countByEMail(eMail);
    }

}
