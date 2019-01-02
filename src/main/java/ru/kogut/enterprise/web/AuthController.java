package ru.kogut.enterprise.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kogut.enterprise.model.security.UserEntity;
import ru.kogut.enterprise.service.security.AuthService;
import ru.kogut.enterprise.service.security.UserServiceImpl;

import java.security.Principal;

@Controller
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping(value = "/login")
    @GetMapping(value = "/login")
    public String login(){
        return "login";
    }

    @GetMapping("/index")
    @PostMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/loginAction", method = RequestMethod.POST)
    public String loginAction(@ModelAttribute("user") UserEntity userEntity){

        final UserEntity user = authService.getUser(userEntity);

        if (user == null){
            return "redirect:/login";
        }

        return "redirect:/index";
    }
}
