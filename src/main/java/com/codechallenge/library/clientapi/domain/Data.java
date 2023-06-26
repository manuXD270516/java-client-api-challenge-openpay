package com.codechallenge.library.clientapi.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Data {
    private Long offset;
    private Long limit;
    private Long total;
    private Long count;
    private List<Result> results;
}