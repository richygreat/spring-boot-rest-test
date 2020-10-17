package com.github.richygreat.tutorial.sbrt.model;

import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class TestDto {
    private String name;
    private OffsetDateTime timestamp;
}
