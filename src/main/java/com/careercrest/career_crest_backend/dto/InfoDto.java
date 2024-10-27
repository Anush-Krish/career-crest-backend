package com.careercrest.career_crest_backend.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class InfoDto {
    private String intro;
    private String title;
    private String about;
    private List<String> topSkills;
}
