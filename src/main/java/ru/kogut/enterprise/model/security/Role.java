package ru.kogut.enterprise.model.security;

import ru.kogut.enterprise.enums.Roles;
import ru.kogut.enterprise.model.AbstractEntity;

import javax.persistence.*;

@Entity
@Table(name = "userRoles")
public class Role extends AbstractEntity {

    @ManyToOne
    private UserEntity users;

    @Column
    @Enumerated(EnumType.STRING)
    private Roles roles = Roles.USER;

    public Role() {
    }

    public Role(UserEntity users, Roles roles) {
        this.users = users;
        this.roles = roles;
    }

    @Override
    public String toString() {
        return roles.name();
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public UserEntity getUser() {
        return users;
    }

    public void setUser(UserEntity users) {
        this.users = users;
    }
}
