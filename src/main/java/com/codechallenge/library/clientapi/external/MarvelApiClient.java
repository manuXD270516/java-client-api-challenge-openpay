package com.codechallenge.library.clientapi.external;

import com.codechallenge.library.clientapi.domain.CharacterData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "marvel-api", url = "https://gateway.marvel.com/v1/public")
public interface MarvelApiClient {
    @GetMapping("/characters")
    List<CharacterData> getCharacters();

    @GetMapping("/characters/{characterId}")
    CharacterData getCharacterById(@PathVariable("characterId") int characterId);
}
