package com.example.sfgdi.controllers;

import com.example.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;

    @BeforeEach
    void setup(){
        controller = new ConstructorInjectedController(new ConstructorGreetingService());

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());

    }
}