package com.codechallenge.library.clientapi.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Stories {
    private Long available;
    private String collectionURI;
    private List<StoriesItem> items;
    private Long returned;
}
