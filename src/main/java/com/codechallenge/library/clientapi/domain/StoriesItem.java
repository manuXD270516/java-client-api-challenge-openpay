package com.codechallenge.library.clientapi.domain;

import com.codechallenge.library.clientapi.domain.enums.Type;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StoriesItem {
    private String resourceURI;
    private String name;
    private String type;
}
