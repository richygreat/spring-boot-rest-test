package com.github.richygreat.tutorial.sbrt.event;

import com.richygreat.event.Sensor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SensorEventListener {
    @StreamListener(Sink.INPUT)
    public void consumeSensorEvent(@Payload Sensor sensor, @Header("timestamp") Long timestamp) {
        log.info("consumeSensorEvent: sensor: {} timestamp: {}", sensor, timestamp);
    }
}
