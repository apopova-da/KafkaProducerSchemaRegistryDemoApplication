package org.kafka.producer.demo.controller.v3;

import org.kafka.producer.demo.VideoCallbackEventProducer;
import org.kafka.producer.demo.controller.v3.dto.VideoCallbackForwardCompatibility;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v3/videoCallbacks")
@RestController
public class VideoCallbackEventControllerV3 {

    private final VideoCallbackEventProducer videoCallbackEventProducer;

    public VideoCallbackEventControllerV3(VideoCallbackEventProducer videoCallbackEventProducer) {
        this.videoCallbackEventProducer = videoCallbackEventProducer;
    }

    @PostMapping
    public String create(@RequestBody VideoCallbackForwardCompatibility event) {
        videoCallbackEventProducer.send(event);
        return "OK";
    }
}
