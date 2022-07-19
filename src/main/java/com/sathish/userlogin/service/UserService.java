package com.sathish.userlogin.service;

import com.sathish.userlogin.Repository.UserRepository;
import com.sathish.userlogin.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user){
        userRepository.save(user);
        return user;
    }
}
