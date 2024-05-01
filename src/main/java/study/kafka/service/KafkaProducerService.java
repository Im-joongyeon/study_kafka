package study.kafka.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.time.Instant;

/**
 * Created by I'm_joongyeon on 4/30/24.
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class KafkaProducerService {
    private final KafkaTemplate kafkaTemplate;
    private static final String TOPIC = "kafka.producer.test";
    private static final String KEY = "현재시간";
    public void sendCurrentTime() {
        kafkaTemplate.send(
                TOPIC,
                KEY,
                Instant.now().toString()
        );
    }
}
