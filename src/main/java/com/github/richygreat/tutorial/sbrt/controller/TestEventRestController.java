package com.github.richygreat.tutorial.sbrt.controller;

import com.richygreat.event.Sensor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/test-event")
public class TestEventRestController {
    private final Source source;

    @GetMapping
    public ResponseEntity<String> sendSensorEvent() {
        Sensor sensor = Sensor.newBuilder().setId(UUID.randomUUID().toString()).build();
        source.output().send(MessageBuilder.withPayload(sensor).build());
        log.info("sendSensorEvent: event sent with Id: {}", sensor.getId());
        return ResponseEntity.ok(sensor.getId().toString());
    }
}
