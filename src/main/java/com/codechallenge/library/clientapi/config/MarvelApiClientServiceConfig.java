package com.codechallenge.library.clientapi.config;

import com.codechallenge.library.clientapi.external.MarvelApiClient;
import com.codechallenge.library.clientapi.service.MarvelApiClientService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.codechallenge.library.clientapi.service")
public class MarvelApiClientServiceConfig {

}
