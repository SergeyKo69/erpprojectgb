package ru.kogut.enterprise.bootstrap;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kogut.enterprise.enums.Roles;
import ru.kogut.enterprise.service.security.UserServiceImpl;

@Component
public class Bootstrap implements InitializingBean {

    @Autowired
    private UserServiceImpl userService;

    @Override
    public void afterPropertiesSet() throws Exception {
        userService.initUser("admin", "123", "admin", "admin@mail.ru", Roles.ADMINISTRATOR);
        userService.initUser("user", "123", "user", "user@mail.ru", Roles.USER);
    }
}
