package com.github.richygreat.tutorial.sbrt;

import com.github.richygreat.tutorial.sbrt.event.DltSink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.schema.registry.client.EnableSchemaRegistryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;

@SpringBootApplication
@EnableFeignClients
@EnableSchemaRegistryClient
@EnableBinding({Source.class, Sink.class, DltSink.class})
public class SpringBootRestTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestTestApplication.class, args);
    }
}
