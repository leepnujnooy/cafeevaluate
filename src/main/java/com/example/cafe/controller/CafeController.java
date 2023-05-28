package com.example.cafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CafeController {

    @GetMapping("/login")
    public String login(){
        return "index";
    }

    @GetMapping("/list")
    public String cafeList(){
        return "cafelist";
    }//카페 리스트 페이지 매핑




}
