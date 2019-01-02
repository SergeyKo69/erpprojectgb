package ru.kogut.enterprise.service.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.kogut.enterprise.model.security.UserEntity;
import ru.kogut.enterprise.repository.security.UserRepository;

import java.security.Principal;

@Service
public class AuthService {

    private final PasswordEncoder passwordEncoder;

    private final UserRepository userRepository;

    @Autowired
    public AuthService(PasswordEncoder passwordEncoder, UserRepository userRepository) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
    }

    @Nullable
    public UserEntity getUser(@Nullable final UserEntity userEntity){
       if (userEntity == null) return null;
       return userRepository.findByLogin(userEntity.getLogin());
    }
}
