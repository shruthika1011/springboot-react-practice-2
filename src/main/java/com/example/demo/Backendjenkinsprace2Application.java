package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Backendjenkinsprace2Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(Backendjenkinsprace2Application.class, args);
		System.out.println("Hi Docker");
	}
	
}
