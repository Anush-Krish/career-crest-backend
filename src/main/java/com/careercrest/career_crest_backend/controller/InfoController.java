package com.careercrest.career_crest_backend.controller;

import com.careercrest.career_crest_backend.dto.InfoDto;
import com.careercrest.career_crest_backend.service.InfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1/info")
@RestController
@RequiredArgsConstructor
public class InfoController {

    private final InfoService infoService;

    @GetMapping
    public ResponseEntity<InfoDto> fetchInfo() {
        return ResponseEntity.status(HttpStatus.OK).body(infoService.fetchInfo());
    }
}
