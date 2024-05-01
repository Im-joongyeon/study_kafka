package study.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.stereotype.Component;
import study.kafka.config.KafkaProducerConfig;
import study.kafka.service.KafkaProducerService;

@SpringBootApplication
public class KafkaApplication {

    
    public static void main(String[] args) {

        SpringApplication.run(KafkaApplication.class, args);
    }

}
