package com.example.sfgdi.config;


import com.example.pets.PetService;
import com.example.pets.PetServiceFactory;
import com.example.sfgdi.repositories.EnglishGreetingRepository;
import com.example.sfgdi.repositories.EnglishGreetingRepositoryImp;
import com.example.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Bean
    @Profile({"dog", "default"})
    PetService dogPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("dog");

    }

    @Bean
    @Profile("cat")
    PetService catPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("cat");

    }


    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18nSpanishGreetingService i18nSpanishGreetingService() {
        return new I18nSpanishGreetingService();


    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImp();
    }


    @Profile("EN")
    @Bean
    I18nGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18nGreetingService(englishGreetingRepository);
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectionGreetingService propertyInjectionGreetingService() {
        return new PropertyInjectionGreetingService();

    }

    @Bean
    SetterInjectionGreetingService setterInjectionGreetingService() {
        return new SetterInjectionGreetingService();


    }
}
