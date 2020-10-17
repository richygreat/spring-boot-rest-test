package com.github.richygreat.tutorial.sbrt.controller;

import com.github.richygreat.tutorial.sbrt.client.TestClient;
import com.github.richygreat.tutorial.sbrt.client.model.TestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test-flow")
@RequiredArgsConstructor
public class TestFlowRestController {
    private final TestClient testClient;

    @GetMapping
    public ResponseEntity<String> readTest() {
        TestDto testDto = testClient.readTest();
        log.info("readTest: testDto: {}", testDto);
        return ResponseEntity.ok("success");
    }
}
