package com.careercrest.career_crest_backend.service;

import com.careercrest.career_crest_backend.dto.InfoDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class InfoService {

    public InfoDto fetchInfo() {
        try {
            List<String> topSkills = Arrays.asList("Spring boot", "PostgresSql", "Hibernate", "Redis", "Apache Kafka");
            return InfoDto.builder().
                    intro("Anush's Career Crest").
                    about("I'm Anush Krishna, Full stack developer, having industry experience as a java backend developer," +
                            "made many functionalities from scratch and improved performance of existing functionality ")
                    .topSkills(topSkills)
                    .build();

        } catch (Exception e) {
            log.error("Error in fetching info.");
            throw new RuntimeException("Error fetching information");
        }
    }
}
