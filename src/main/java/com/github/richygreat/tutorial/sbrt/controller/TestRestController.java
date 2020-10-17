package com.github.richygreat.tutorial.sbrt.controller;

import com.github.richygreat.tutorial.sbrt.model.TestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestRestController {
    @GetMapping
    public ResponseEntity<TestDto> readTest() {
        TestDto testDto = new TestDto();
        testDto.setName("test");
        testDto.setTimestamp(OffsetDateTime.now());
        log.info("readTest: testDto: {}", testDto);
        return ResponseEntity.ok(testDto);
    }
}
