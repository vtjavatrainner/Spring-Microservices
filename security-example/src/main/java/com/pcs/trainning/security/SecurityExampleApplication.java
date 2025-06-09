package com.pcs.trainning.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityExampleApplication.class, args);
	}

}

// Authentication
// Are you a legitimate user .. do you have correct user id and password

// Authorization
// Do you have correct role to do the work or access any API
