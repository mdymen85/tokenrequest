package com.security.tokenrequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TokenrequestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TokenrequestApplication.class, args);
	}

}
