package com.codechallenge.library.clientapi.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
public class ComicsItem {
    private String resourceURI;
    private String name;
}
