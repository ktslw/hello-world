package com.example.helloworld.rest;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloWorldResouce {


    @RequestMapping("/")
    public String welcome(Model model){
        String message = "Hello World";
        model.addAttribute("message", message);
        return "welcome";
    }

    @RequestMapping("/getMessage")
    public String getMessage(){
        return "Hello World!";
    }
}
