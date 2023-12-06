package com.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * `@SpringBootApplication` is used in Spring Boot applications to enable
 * auto-configuration, component scanning, and serve as an entry point,
 * combining the functionalities of `@Configuration`,
 * `@EnableAutoConfiguration`, and `@ComponentScan`.
 */
@SpringBootApplication
public class UserServiceApplication {
	
	// Main method that starts the UserServiceApplication
	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}
	
}
