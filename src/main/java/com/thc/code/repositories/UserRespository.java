package com.thc.code.repositories;

import com.thc.code.domain.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRespository {

    private List<User> users  = new ArrayList<>();

    public UserRespository() {
        users.add(new User("Facundo", "Crusta", "Taglife", "123"));
    }

    public User getUserByUserName(String userName) {
        for (User user : users) {
            if (user.getUserName().equalsIgnoreCase(userName))
            return user;
        }

        return null;
    }

    public boolean createUser(User user) {
       return users.add(user);
    }


}
