package com.example.cafe.controller;

import com.example.cafe.dto.UserDTO;
import com.example.cafe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/login")
    public String goLoginPage(){
        return "login";
    }




    @PostMapping("/login/isUser")
    public String isUser(@ModelAttribute UserDTO userDTO, Model model){


        UserDTO dto = userService.isUser(userDTO);

        if(dto != null){
            model.addAttribute("message","회원님 환영합니다.");
            model.addAttribute("searchUrl","/cafe/list");
        }
        else {
            model.addAttribute("message","회원정보가 없습니다.");
            model.addAttribute("searchUrl","/login");
        }

        return "message";
    }


    @GetMapping("/signup")
    public String goSignUp(){
        return "signup";
    }

    @PostMapping("/signup/signupProcessing")
    public String doSignUp(UserDTO userDTO){

        userService.saveUser(userDTO);

        return "redirect:/login";
    }



}
