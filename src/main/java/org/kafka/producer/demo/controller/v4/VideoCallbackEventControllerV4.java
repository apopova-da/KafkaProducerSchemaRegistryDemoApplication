package org.kafka.producer.demo.controller.v4;

import org.kafka.producer.demo.VideoCallbackEventProducer;
import org.kafka.producer.demo.controller.v4.dto.VideoCallbackV4;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v4/videoCallbacks")
@RestController
public class VideoCallbackEventControllerV4 {

    private final VideoCallbackEventProducer videoCallbackEventProducer;

    public VideoCallbackEventControllerV4(VideoCallbackEventProducer videoCallbackEventProducer) {
        this.videoCallbackEventProducer = videoCallbackEventProducer;
    }

    @PostMapping
    public String create(@RequestBody VideoCallbackV4 event) {
        videoCallbackEventProducer.send(event);
        return "OK";
    }
}
