package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MqEmployeeSpringBootAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MqEmployeeSpringBootAppApplication.class, args);
	
		MySender sender = context.getBean(MySender.class);
		
		sender.sendMessage("Huey");
		sender.sendMessage("Louis");
		sender.sendMessage("Dewey");		
	}

}
