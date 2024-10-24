package com.careercrest.career_crest_backend.service;

import com.careercrest.career_crest_backend.dto.InfoDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class InfoService {

    public InfoDto fetchInfo() {
        try {
            return InfoDto.builder().
                    intro("Anush's Career Crest").
                    about("I am full stack developer, having Industry experience as a java backend developer ")
                    .build();

        } catch (Exception e) {
            log.error("Error in fetching info.");
            throw new RuntimeException("Error fetching information");
        }
    }
}
