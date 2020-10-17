package com.github.richygreat.tutorial.sbrt.client;

import com.github.richygreat.tutorial.sbrt.client.model.TestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "${feign.test.name}", url = "${feign.test.url}")
public interface TestClient {
    @GetMapping
    TestDto readTest();
}
