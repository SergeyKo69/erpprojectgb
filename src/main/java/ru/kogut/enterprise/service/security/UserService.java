package ru.kogut.enterprise.service.security;

import ru.kogut.enterprise.common.Answer;
import ru.kogut.enterprise.model.security.UserEntity;

import javax.transaction.Transactional;
import java.util.List;

public interface UserService {
    Answer save(UserEntity user);
    Answer update(UserEntity user);
    UserEntity getById(String id);
    List<UserEntity> getAll();
    void delete(UserEntity user);
    UserEntity findByLoginAndPassword(String login, String password);
    void initUser(String login, String password, String userName, String eMail);
    void createUser(String login, String password, String userName, String eMail);
    long countByLogin(String login);
    long countByEMail(String eMail);
}
