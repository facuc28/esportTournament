package com.thc.code.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserResource {

    @RequestMapping("/add")
    public String createUser() {
        return "register";
    }
}
