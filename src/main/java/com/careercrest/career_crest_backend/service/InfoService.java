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
            List<String> topSkills = Arrays.asList("Spring boot", "Apache Kafka", "PostgresSql", "Hibernate", "Redis",
                    "React", "TypeScript");
            return InfoDto.builder()
                    .intro("Anush's Career Crest")
                    .title("Java Full Stack Developer")
                    .about("\"I'm Anush Krishna, experienced Java backend developer with a strong track record of designing and " +
                            "implementing core functionalities from the ground up, as well as optimizing the performance" +
                            " of existing systems. Alongside my backend expertise, I have hands-on knowledge of frontend " +
                            "development, enabling me to contribute effectively to full-stack project success.\"")
                    .topSkills(topSkills)
                    .build();

        } catch (Exception e) {
            log.error("Error in fetching info.");
            throw new RuntimeException("Error fetching information");
        }
    }
}
