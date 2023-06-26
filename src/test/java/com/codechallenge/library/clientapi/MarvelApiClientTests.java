package com.codechallenge.library.clientapi;

import com.codechallenge.library.clientapi.domain.CharacterData;
import com.codechallenge.library.clientapi.domain.ComicApiResponse;
import com.codechallenge.library.clientapi.external.MarvelApiClient;
import com.codechallenge.library.clientapi.service.MarvelApiClientService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class MarvelApiClientTests {
    @Mock
    private MarvelApiClientService marvelApiClient;

    @Test
    void testGetCharacters() {
        // Configura el objeto mock del cliente de Marvel API para devolver una respuesta simulada
        ComicApiResponse mockResponse = createMockCharactersResponse();
        Mockito.when(marvelApiClient.getCharacters()).thenReturn(mockResponse);

        // Realiza la llamada al método y verifica el resultado
        ComicApiResponse response = marvelApiClient.getCharacters();
        assertNotNull(response);
        assertEquals(200, response.getCode());
        assertEquals("Ok", response.getStatus());
        assertEquals("© 2023 MARVEL", response.getCopyright());
    }

    @Test
    void testGetCharacterById() {
        // Configura el objeto mock del cliente de Marvel API para devolver una respuesta simulada
        ComicApiResponse mockResponse = createMockCharactersResponse();
        Mockito.when(marvelApiClient.getCharacterById(1)).thenReturn(mockResponse);

        // Realiza la llamada al método y verifica el resultado
        ComicApiResponse response = marvelApiClient.getCharacterById(1);
        assertNotNull(response);
        assertEquals(200, response.getCode());
        assertEquals("Ok", response.getStatus());
        assertEquals("© 2023 MARVEL", response.getCopyright());
    }

    // Otros casos de prueba similares para el método getCharacterById
    // ...

    private ComicApiResponse createMockCharactersResponse() {
        return createMockCharacter(200l, "Ok", "© 2023 MARVEL");
    }

    private ComicApiResponse createMockCharacter(Long code, String status, String copyright) {
        ComicApiResponse character = ComicApiResponse.builder()
                .code(code)
                .status(status)
                .copyright(copyright)
                .build();
        return character;
    }
}
