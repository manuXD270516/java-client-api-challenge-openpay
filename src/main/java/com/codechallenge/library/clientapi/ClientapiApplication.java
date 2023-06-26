package com.codechallenge.library.clientapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.codechallenge.library.clientapi.external.MarvelApiClient")
public class ClientapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientapiApplication.class, args);
	}

}
