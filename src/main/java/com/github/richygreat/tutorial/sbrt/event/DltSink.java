package com.github.richygreat.tutorial.sbrt.event;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface DltSink {
    String DLT_INPUT = "dlt-input";

    @Input(DLT_INPUT)
    SubscribableChannel dltInput();
}
