package com.jnm.cardealersms;

import com.jnm.cardealersms.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class ApplicationController {


    @GetMapping("/index")
    public String goHome(){
        return "index";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/logout")
    public String logout(){
        return "login";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }




}
