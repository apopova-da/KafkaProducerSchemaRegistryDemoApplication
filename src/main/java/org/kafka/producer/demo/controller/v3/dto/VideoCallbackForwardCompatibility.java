package org.kafka.producer.demo.controller.v3.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.kafka.producer.demo.controller.VideoCallback;

public class VideoCallbackForwardCompatibility extends VideoCallback {

    @JsonProperty(required = true, value = "contact_info")
    public String contactInfo;

    @JsonProperty(required = true, value = "modality")
    public String modality;

    public VideoCallbackForwardCompatibility(String status, String contactInfo, String modality) {
        super(status);
        this.contactInfo = contactInfo;
        this.modality = modality;
    }

    @Override
    public String toString() {
        return "VideoCallbackForwardCompatibility{" +
            "status='" + status + '\'' +
            ", contactInfo='" + contactInfo + '\'' +
            ", modality='" + modality + '\'' +
            '}';
    }
}
