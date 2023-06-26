package com.codechallenge.library.clientapi.domain;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Result {
    private Long id;
    private String name;
    private String description;
    private String modified;
    private Thumbnail thumbnail;
    private String resourceURI;
    private Comics comics;
    private Comics series;
    private Stories stories;
    private Comics events;
    private List<URL> urls;
}
