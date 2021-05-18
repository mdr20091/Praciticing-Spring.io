package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;

/**
 *
 */
public class PropertyInjectionController {


    public GreetingService greetingService;
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
