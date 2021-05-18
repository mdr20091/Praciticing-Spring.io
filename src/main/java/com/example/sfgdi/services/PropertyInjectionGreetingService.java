package com.example.sfgdi.services;


import org.springframework.stereotype.Service;

public class PropertyInjectionGreetingService implements GreetingService {
@Override
    public String sayGreeting(){
        return "hello Dawg - Property";
    }
}
