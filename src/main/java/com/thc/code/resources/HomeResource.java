package com.thc.code.resources;

import com.thc.code.mappers.HomeMapper;
import com.thc.code.mappers.SummonerMapper;
import com.thc.code.services.SummonerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


@Controller
public class HomeResource {

    @Autowired
    HomeMapper homeMapper;

    @Autowired
    SummonerService summonerService;

    @Autowired
    SummonerMapper summonerMapper;

    @GetMapping("/")
    String index() {
        return "index";
    }

    @GetMapping("/home")
    String home() {
        return "index";
    }

    @RequestMapping(value = "/home" , method = RequestMethod.POST)
    public String doLogin(HttpServletRequest request, Model model) {

//        String name = request.getParameter("summoner");
//        String password = request.getParameter("password");
//
//        if (StringUtils.isEmpty(name)) {
//            return "index";
//        }
//
////        SummonerAPI summoner = summonerMapper.retrieveSummonerInformation(name);
//        UserSession userSession = new UserSession();
//        userSession.setSessionId("00001");
//        if (summoner != null) {
//            model.addAttribute("summoner", summoner);
//            model.addAttribute("session", userSession);
//        } else {
//            model.addAttribute("summoner", null);
//            model.addAttribute("session", null);
//        }

        return "index";
    }
}
