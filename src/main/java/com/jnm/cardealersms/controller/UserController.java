package com.jnm.cardealersms.controller;

import com.jnm.cardealersms.model.User;
import com.jnm.cardealersms.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class UserController {

    @Autowired private UserService userService;
    @GetMapping("/user")
    public String getUser(){

        return "User";
    }

    @PostMapping(value = "/user/addNew")
    public RedirectView addNew(User user, RedirectAttributes redir){
        userService.save(user);
        RedirectView redirectView = new RedirectView("/login", true);
        redir.addFlashAttribute("message", "you have successfully registered proceed to login");
        return redirectView;
    }
}
