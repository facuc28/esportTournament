package com.thc.code.services;

import com.thc.code.domain.User;
import com.thc.code.repositories.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    UserRespository userRespository;

    public User getUserbyUserName(String userName) {
        return userRespository.getUserByUserName(userName);
    }

    public boolean createUser(User user) {
        return userRespository.createUser(user);
    }
}
