package org.kafka.producer.demo.controller.v4.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.kafka.producer.demo.controller.VideoCallback;

public class VideoCallbackV4 extends VideoCallback {

    @JsonProperty(required = true, value = "contact_info")
    public String contactInfo;

    @JsonProperty(required = true, value = "modality")
    public Integer modality;

    public VideoCallbackV4(String status, String contactInfo, Integer modality) {
        super(status);
        this.contactInfo = contactInfo;
        this.modality = modality;
    }

    @Override
    public String toString() {
        return "VideoCallbackV4{" +
            "status='" + status + '\'' +
            ", contactInfo='" + contactInfo + '\'' +
            ", modality=" + modality +
            '}';
    }
}
