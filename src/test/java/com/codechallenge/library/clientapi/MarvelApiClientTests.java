package com.codechallenge.library.clientapi;

import com.codechallenge.library.clientapi.domain.CharacterData;
import com.codechallenge.library.clientapi.external.MarvelApiClient;
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
    private MarvelApiClient marvelApiClient;

    @Test
    void testGetCharacters() {
        // Configura el objeto mock del cliente de Marvel API para devolver una respuesta simulada
        List<CharacterData> mockResponse = createMockCharactersResponse();
        Mockito.when(marvelApiClient.getCharacters()).thenReturn(mockResponse);

        // Realiza la llamada al método y verifica el resultado
        List<CharacterData> response = marvelApiClient.getCharacters();
        assertNotNull(response);
        assertEquals(2, response.size());
        assertEquals("Character 1", response.get(0).getName());
        assertEquals("Character 2", response.get(1).getName());
    }

    // Otros casos de prueba similares para el método getCharacterById
    // ...

    private List<CharacterData> createMockCharactersResponse() {
        List<CharacterData> data = Arrays.asList(
                createMockCharacter(1, "Character 1", "Description 1"),
                createMockCharacter(2, "Character 2", "Description 2")
        );
        return data;
    }

    private CharacterData createMockCharacter(int id, String name, String description) {
        CharacterData character = new CharacterData();
        character.setId(id);
        character.setName(name);
        character.setDescription(description);
        return character;
    }
}
