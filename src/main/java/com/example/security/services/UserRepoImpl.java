package com.example.security.services;

import com.example.security.UserRepo;
import com.example.security.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRepoImpl {

    @Autowired
    UserRepo dao;

    public User getUserByName(String userName) {
        return dao.findByUserName(userName);
    }

    public User saveUser(String name, String pass, String role) {
        return dao.save(new User(name, pass, role));
    }

}
