package com.example.springbootawsdeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController {
    @GetMapping("/data")
    public String getData(){
        return "First Message from AWS ECS";
    }

    @GetMapping("/message")
    public String getMessage(){
        return "Second Message from AWS ECS demo";
    }

    @GetMapping("/gojo")
    public String getGojo(){
        return "Daijobu Boku Wa Saikyo Dakara";
    }
}
