package com.codechallenge.library.clientapi.config;

import com.codechallenge.library.clientapi.external.MarvelApiClient;
import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*@Configuration
@EnableFeignClients*/
public class FeignConfig {
    /*@Bean
    public MarvelApiClient marvelApiClient() {
        // Additional Feign client configuration if needed
        return feignClientBuilder().target(MarvelApiClient.class, "https://gateway.marvel.com/v1/public");
    }

    // Additional Feign client configuration if needed
    private Feign.Builder feignClientBuilder() {
        return Feign.builder()
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder());
    }*/
}
