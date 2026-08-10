package com.enochjason;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Pro1Application {

	public static void main(String[] args) {
		SpringApplication.run(Pro1Application.class, args);
	}

	@GetMapping
	public String hello(){
		return "Hello World from Spring Boot";
	}

}
