package com.codechallenge.library.clientapi.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Comics {
    private Long available;
    private String collectionURI;
    private List<ComicsItem> items;
    private Long returned;
}
