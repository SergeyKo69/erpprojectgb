package ru.kogut.enterprise.repository.security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.kogut.enterprise.model.security.UserEntity;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

    List<UserEntity> findByLoginAndPassword(String login, String password);

    long countByLogin(@Param("login") String login);
    long countByEMail(@Param("eMail") String eMail);
}
