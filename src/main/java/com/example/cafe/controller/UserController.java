package com.example.cafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {


    @GetMapping("/signup")
    public String goSignUp(){
        return "signup";
    }

    @PostMapping("/signup/signupProcessing")
    public String doSignUp(){

        return "signup";
    }



}
