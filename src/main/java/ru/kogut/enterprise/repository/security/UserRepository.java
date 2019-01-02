package ru.kogut.enterprise.repository.security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.kogut.enterprise.model.security.UserEntity;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

    List<UserEntity> findFirst1ByLoginAndPassword(@Param("login") String login, @Param("password") String password);
    List<UserEntity> findFirst1ByUserName(@Param("userName") String userName);

    UserEntity findByLogin(@Param("login") String login);

    long countByLogin(@Param("login") String login);
    long countByEMail(@Param("eMail") String eMail);
}
