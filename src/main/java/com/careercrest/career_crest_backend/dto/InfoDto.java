package com.careercrest.career_crest_backend.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class InfoDto {
    private String intro;
    private String about;
}
