package com.example.message.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.message.api"})
public class MessageApiApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(MessageApiApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
