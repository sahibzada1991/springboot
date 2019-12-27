package com.xyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppExample {

	public static void main(String[] args) {

		System.out.println("My application is working");

		SpringApplication.run(AppExample.class, args);

	}

}
