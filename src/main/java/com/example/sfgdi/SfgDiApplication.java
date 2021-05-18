package com.example.sfgdi;

import com.example.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.example.sfgdi", "com.example.pets"})
@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {


		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("-------What is the best pet?");
		System.out.println(petController.whichPetIsTheBest());


		System.out.println("----------Primary");
		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println(myController.getPrimary());

		System.out.println("----------Property");
		PropertyInjectionController propertyInjectionController = (PropertyInjectionController) ctx.getBean("propertyInjectionController");
		System.out.println(propertyInjectionController.getGreeting());

		System.out.println("----------Setter");

		SetterInjectionController setterInjectionController = (SetterInjectionController) ctx.getBean("setterInjectionController");
		System.out.println(setterInjectionController.getGreeting());

		System.out.println("--------Constructor");

		ConstructorInjectedController constructorInjectedController=(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("----------I18n");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayGreeting());

	}

}
