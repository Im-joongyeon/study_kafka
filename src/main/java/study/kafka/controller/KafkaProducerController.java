package study.kafka.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.kafka.model.result.ApiResponse;
import study.kafka.service.KafkaProducerService;

/**
 * Created by I'm_joongyeon on 4/30/24.
 */
@RestController
@RequestMapping("/producer")
@RequiredArgsConstructor
@Slf4j
public class KafkaProducerController {
    private final KafkaProducerService service;

    @GetMapping("/get")
    public ApiResponse<String> sendCurrentTime() {
        service.sendCurrentTime();
        String result = "ok";

        return new ApiResponse<>(result);
    }
}
