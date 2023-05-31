package com.example.cafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CafeController {

    @GetMapping("/cafe/list")
    public String goList(){
        return "cafelist";
    }

}
