package com.mindtree.VoterService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class VoterRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoterRegistrationApplication.class, args);
	}

}

