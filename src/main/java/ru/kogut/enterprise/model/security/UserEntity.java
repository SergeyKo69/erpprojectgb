package ru.kogut.enterprise.model.security;

import ru.kogut.enterprise.model.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity extends AbstractEntity {

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "userName")
    private String userName;

    @Column(name = "eMail")
    private String eMail;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
