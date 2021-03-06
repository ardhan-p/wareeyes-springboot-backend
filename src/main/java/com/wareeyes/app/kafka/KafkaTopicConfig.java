package com.wareeyes.app.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

// TODO: find a way to programitcally create new kafka topics
// kafka topic config class is needed to create new kafka topics
@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic createTopic() {
        return TopicBuilder.name("testTopic").build();
    }
}
