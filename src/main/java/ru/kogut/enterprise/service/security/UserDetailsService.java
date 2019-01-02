package ru.kogut.enterprise.service.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.kogut.enterprise.model.security.Role;
import ru.kogut.enterprise.model.security.UserEntity;
import ru.kogut.enterprise.repository.security.UserRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service("userDetailsService")
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        final UserEntity user = findByLogin(userName);
        if (user == null) throw new UsernameNotFoundException("User not found");
        User.UserBuilder builder = null;
        builder = User.withUsername(userName);
        builder.password(user.getPassword());
        final List<Role> userRoles = user.getRoles();
        final List<String> roles = new ArrayList<>();
        for (Role role:userRoles) {
            roles.add(role.toString());
        }
        builder.roles(roles.toArray(new String[]{}));
        return builder.build();
    }

    private UserEntity findByLogin(String userName){
        if (userName == null || userName.isEmpty()) return null;
        List<UserEntity> userList = userRepository.findFirst1ByUserName(userName);
        if (userList.size() == 0) return null;
        return userList.get(0);
    }
}
