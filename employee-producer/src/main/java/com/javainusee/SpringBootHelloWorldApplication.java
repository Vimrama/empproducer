package com.javainusee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class SpringBootHelloWorldApplication {
	@RequestMapping("/")
	String home() {
		return "Hello World! from springboot to angular6";
	}
	@RequestMapping("/add")
	int add() {
		return 20+10;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}
}