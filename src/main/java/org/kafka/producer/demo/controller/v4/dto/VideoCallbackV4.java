package org.kafka.producer.demo.controller.v4.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.kafka.producer.demo.controller.VideoCallback;

public class VideoCallbackV4 extends VideoCallback {

    @JsonProperty(required = true, value = "contact_info")
    public String contactInfo;

    @JsonProperty(required = true, value = "ehr_id")
    public Integer ehrId;

    @JsonProperty(required = true, value = "modality")
    public String modality;

    public VideoCallbackV4(String status, String contactInfo, Integer ehrId, String modality) {
        super(status);
        this.contactInfo = contactInfo;
        this.ehrId = ehrId;
        this.modality = modality;
    }

    @Override
    public String toString() {
        return "VideoCallbackV4{" +
            "status='" + status + '\'' +
            ", contactInfo='" + contactInfo + '\'' +
            ", ehrId=" + ehrId +
            ", modality='" + modality + '\'' +
            '}';
    }
}
