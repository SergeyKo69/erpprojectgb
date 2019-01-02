package ru.kogut.enterprise.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.kogut.enterprise.model.security.UserEntity;
import ru.kogut.enterprise.service.security.UserServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@Controller
//@RequestMapping("/")
public class LoginController {

//    @Autowired
//    private UserServiceImpl userService;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @GetMapping("/login")
//    public String login(){
//        return "login";
//    }
//
//    @GetMapping("/")
//    public String indexPage(HttpServletRequest request){
//        final HttpSession session = request.getSession();
//        if (session.getAttribute("auth") == null) return "redirect:/login";
//        return "redirect:/index";
//    }
//
//    @GetMapping("/index")
//    @PostMapping("/index")
//    public String index(HttpServletRequest request){
//        final HttpSession session = request.getSession();
//        if(session.getAttribute("auth") == null) return "redirect:/login";
//        return "index";
//    }
//
//    @RequestMapping(value = "/loginAction", method = RequestMethod.POST)
//    public String loginAction(
//            final HttpServletRequest request,
//            final HttpServletResponse response,
//            @ModelAttribute("login") String login,
//            @ModelAttribute("password") String password
//            ){
//        if (login == null || password == null) return "redirect:/login";
//        if (login.isEmpty() || password.isEmpty()) return "redirect:/login";
//
//        final String pass = passwordEncoder.encode(password);
////        final UserEntity user = userService.findByLoginAndPassword(login, pass);
////        if (user == null){
////            return "redirect:/login";
////        }
//
//        final long rez = userService.countByLogin(login);
//
//        if (rez == 0){
//            return "redirect:/login";
//        }
//
//        final HttpSession session = request.getSession();
//        session.setAttribute("auth", true);
////        session.setAttribute("userId", user.getId());
//        return "redirect:/index";
//    }
//
//    @GetMapping("/logout")
//    @PostMapping("/logout")
//    public String logout(HttpServletRequest request){
//        final HttpSession session = request.getSession();
//        session.invalidate();
//        return "redirect:/login";
//    }
}
