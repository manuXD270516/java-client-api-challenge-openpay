package com.codechallenge.library.clientapi.domain.enums;

import java.io.IOException;

public enum Type {
    COVER("cover"),
    INTERIOR_STORY("interiorStory");

    private final String value;
    Type(String value) {
        this.value = value;
    }

    public String getValue(){return value;}

}
