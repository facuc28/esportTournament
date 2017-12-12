package com.thc.code.framework;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class Login {

    private String login;
    private String password;

    public Login() {
    }

    public Login(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Login readEntityOfRequest(HttpServletRequest request) {
       return new Login(request.getParameter("user"), request.getParameter("password"));
    }
}
