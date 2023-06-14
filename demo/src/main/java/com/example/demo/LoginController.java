package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/hello")
    public String  sayHelllo()
    {
        return "Hello World";
    }

    @GetMapping("/lire")
    public String lire (){

        return "bjr";

    }
}
