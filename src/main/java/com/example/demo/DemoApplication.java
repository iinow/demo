package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DemoApplication.class);
//		SpringApplication.run(DemoApplication.class, args);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8888"));
		app.run(args);
	}

}
