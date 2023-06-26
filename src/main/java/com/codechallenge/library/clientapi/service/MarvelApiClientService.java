package com.codechallenge.library.clientapi.service;

import com.codechallenge.library.clientapi.domain.CharacterData;
import com.codechallenge.library.clientapi.domain.ComicApiResponse;
import com.codechallenge.library.clientapi.external.MarvelApiClient;
import lombok.AllArgsConstructor;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MarvelApiClientService {

    private static final String PUBLIC_KEY ="9b1cce488b02a5d8e15514177d6ac86f";
    private static final String PRIVATE_KEY ="863fb61c3112075a8275c8e4d38724a7f72ea1d0";

    private final MarvelApiClient marvelApiClient;

    public MarvelApiClientService(MarvelApiClient marvelApiClient){
        this.marvelApiClient = marvelApiClient;
    }

    public ComicApiResponse getCharacters() {
        Long timeStamp =new Date().getTime();
        return marvelApiClient.getCharacters(timeStamp, PUBLIC_KEY, buildHash(timeStamp));
    }

    public ComicApiResponse getCharacterById(long id) {
        Long timeStamp =new Date().getTime();
        return marvelApiClient.getCharacterById(timeStamp, PUBLIC_KEY, buildHash(timeStamp), id);
    }

    private String buildHash(Long timeStamp)  {
        String input = timeStamp + PRIVATE_KEY + PUBLIC_KEY;
        return DigestUtils.md5Hex(input);
    }
}
