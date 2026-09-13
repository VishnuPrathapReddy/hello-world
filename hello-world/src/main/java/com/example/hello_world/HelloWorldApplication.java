package com.example.hello_world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
public class HelloWorldApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

    @Override
    public void run(String... args) {
        System.out.println("Hello World from Spring Boot!");
    }

}
