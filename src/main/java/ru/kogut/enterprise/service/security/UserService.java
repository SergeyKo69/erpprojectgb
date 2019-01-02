package ru.kogut.enterprise.service.security;

import ru.kogut.enterprise.common.Answer;
import ru.kogut.enterprise.enums.Roles;
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
    UserEntity findByUserName(String userName);
    UserEntity findByLogin(String login);
    void initUser(String login, String password, String userName, String eMail, Roles roles);
    UserEntity createUser(String login, String password, String userName, String eMail);
    UserEntity createUser(String login, String password, String userName, String eMail, List<Roles> roles);
    long countByLogin(String login);
    long countByEMail(String eMail);
}
