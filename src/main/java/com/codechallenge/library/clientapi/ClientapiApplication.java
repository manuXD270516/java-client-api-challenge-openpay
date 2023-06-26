package com.codechallenge.library.clientapi;

import com.codechallenge.library.clientapi.domain.CharacterData;
import com.codechallenge.library.clientapi.domain.ComicApiResponse;
import com.codechallenge.library.clientapi.external.MarvelApiClient;
import com.codechallenge.library.clientapi.service.MarvelApiClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@SpringBootApplication(scanBasePackages = "com.codechallenge.library.clientapi.service")
@EnableFeignClients
@ImportAutoConfiguration({FeignAutoConfiguration.class})
//@ComponentScan(basePackages = "com.codechallenge.library.clientapi.service")
//@EnableFeignClients("com.codechallenge.library.clientapi.external.MarvelApiClient")
public class ClientapiApplication implements CommandLineRunner {

	@Autowired
	private MarvelApiClientService marvelApiClient;

	public static void main(String[] args) {
		SpringApplication.run(ClientapiApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		ComicApiResponse data = marvelApiClient.getCharacters();
		System.out.println(data.getEtag()+ " === "+data.getCopyright());
	}
}
