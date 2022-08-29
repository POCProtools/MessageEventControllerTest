package com.example.activemqpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringBootActiveMqDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActiveMqDemoApplication.class, args);
	}

}