package com.thc.code.resources;

import com.thc.code.mappers.HomeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginResource {

    @Autowired
    private HomeMapper homeMapper;

    @RequestMapping(value = "/login" , method = RequestMethod.GET)
    public String login() {
        return "login";
    }

}
