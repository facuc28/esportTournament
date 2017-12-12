package com.thc.code.mappers;

import com.thc.code.domain.User;
import com.thc.code.framework.ChannelResponse;
import com.thc.code.framework.Login;
import com.thc.code.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpServletRequest;

@Component
public class HomeMapper {

    @Autowired
    Login login;

    @Autowired
    UserService userService;

    @Autowired
    ChannelResponse channelResponse;

    public ModelMap map(HttpServletRequest request){
        if (authenticateUser(request.getParameter("user"), request.getParameter("password"))) {
            User user = getUser(request.getParameter("user"));

            channelResponse.addAttribute("user", user);
        }

        return channelResponse;
    }

    private boolean authenticateUser(String userName, String password) {
        User user = userService.getUserbyUserName(userName);

       return user != null && user.getPassword().equalsIgnoreCase(password);

    }

    private User getUser(String name) {
        return userService.getUserbyUserName(name);
    }
}
