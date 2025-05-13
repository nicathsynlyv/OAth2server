package com.example.oauth2server;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Oauth2serverApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2serverApplication.class, args);
	}
	@Override
	public void run(String... args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "clientsecret";
		String encodedPassword = encoder.encode(rawPassword);
		System.out.println("Encoded Password: " + encodedPassword);
	}
}
