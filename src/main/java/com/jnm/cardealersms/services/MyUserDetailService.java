package com.jnm.cardealersms.services;

import com.jnm.cardealersms.model.User;
import com.jnm.cardealersms.model.UserPrincipal;
import com.jnm.cardealersms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class MyUserDetailService implements UserDetailsService{

    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);

        if (username == null) {
            throw new UsernameNotFoundException("user not found!");
        }

        return new UserPrincipal(user);

    }
}
