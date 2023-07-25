package com.jnm.cardealersms.services;

import com.jnm.cardealersms.controller.UserController;
import com.jnm.cardealersms.model.User;
import com.jnm.cardealersms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired private UserRepository userRepository;
    @Autowired private BCryptPasswordEncoder encoder;
    public void save(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        userRepository.save(user);
    }
}
