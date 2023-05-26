package com.example.cafe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class CafeApplication {
    @GetMapping("/")
    public String test(){
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(CafeApplication.class, args);
        CafeApplication ca = new CafeApplication();
        ca.test();
    }

}
