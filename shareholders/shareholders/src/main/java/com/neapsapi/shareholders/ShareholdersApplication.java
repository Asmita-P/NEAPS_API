package com.neapsapi.shareholders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ShareholdersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShareholdersApplication.class, args);
	}

}
