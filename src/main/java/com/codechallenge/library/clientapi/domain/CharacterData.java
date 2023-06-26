package com.codechallenge.library.clientapi.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CharacterData {

    private int id;
    private String name;
    private String description;
}
