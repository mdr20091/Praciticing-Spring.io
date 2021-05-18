package com.example.sfgdi.services;


import com.example.sfgdi.repositories.EnglishGreetingRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class I18nGreetingService implements GreetingService{

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting(){
        return "You Speak the English?";
    }

}
