package com.example.cafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CafeController {

    @GetMapping("/login")
    public String goLoginPage(){
        return "login";
    }



}
