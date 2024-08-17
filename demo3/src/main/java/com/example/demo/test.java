package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.PublicKey;

@Controller
public class test {

    @GetMapping("/toindex")
    public String toin(){
        return "index";
    }
}
