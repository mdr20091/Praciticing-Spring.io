package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

private final GreetingService greetingService;

    public MyController(@Qualifier("primaryGreetingService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getPrimary(){
        return greetingService.sayGreeting();

    }
}
