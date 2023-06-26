package com.codechallenge.library.clientapi.external;

import com.codechallenge.library.clientapi.domain.CharacterData;
import com.codechallenge.library.clientapi.domain.ComicApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "marvel-api", url = "https://gateway.marvel.com/v1/public")
@Component
public interface MarvelApiClient {
    @GetMapping("/characters")
    ComicApiResponse getCharacters(
            @RequestParam("ts") Long timeStamp,
            @RequestParam("apikey") String apikey,
            @RequestParam("hash") String hash);

    @GetMapping("/characters/{characterId}")
    ComicApiResponse getCharacterById(
            @RequestParam("ts") Long timeStamp,
            @RequestParam("apikey") String apikey,
            @RequestParam("hash") String hash,
            @PathVariable("characterId") long characterId);
}
