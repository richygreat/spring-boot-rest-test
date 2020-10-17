package com.github.richygreat.tutorial.sbrt.controller;

import com.github.richygreat.tutorial.sbrt.client.model.TestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequestMapping("/test-flow")
@RequiredArgsConstructor
public class TestFlowRestController {
    private final RestTemplate restTemplate;

    @GetMapping
    public ResponseEntity<String> readTest() {
        ResponseEntity<TestDto> testDtoResponseEntity = restTemplate
                .getForEntity("http://localhost:8080/test", TestDto.class);
        log.info("readTest: testDtoResponseEntity: {}", testDtoResponseEntity);
        return ResponseEntity.ok("success");
    }
}
