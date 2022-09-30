package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class demoController {

    private final GreetingService greetingService;

    public demoController(@Autowired GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String helloWorld(){
        return greetingService.sayGreeting();
    }
}
