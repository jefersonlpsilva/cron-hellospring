package com.example.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class HellospringApplication {

	public static void main(String[] args) {
		System.out.println("Start app");
		SpringApplication.run(HellospringApplication.class, args);
	}

}
