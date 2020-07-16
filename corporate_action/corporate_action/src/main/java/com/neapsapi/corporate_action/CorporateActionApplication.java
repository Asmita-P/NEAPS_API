package com.neapsapi.corporate_action;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CorporateActionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CorporateActionApplication.class, args);
	}

}
