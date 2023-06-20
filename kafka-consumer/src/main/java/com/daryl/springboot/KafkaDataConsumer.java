package com.daryl.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDataConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDataConsumer.class);

    @KafkaListener(
            topics = "wikimedia_recentchange",
            groupId = "aGroup"
    )

    public void consume(String eventMessage) {
        LOGGER.info(String.format("Event message received -> %s", eventMessage));
    }
}
