package com.bridgelabz.resttemplate2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Resttemplate2Application {

	public static void main(String[] args) {
		SpringApplication.run(Resttemplate2Application.class, args);

		RestTemplate restTemplate = new RestTemplate();
		String response = restTemplate.getForObject("http://localhost:8081/get", String.class);
		System.out.println(response);
	}

}
