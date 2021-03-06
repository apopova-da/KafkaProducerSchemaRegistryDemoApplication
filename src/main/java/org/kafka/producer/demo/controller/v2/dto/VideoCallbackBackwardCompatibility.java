package org.kafka.producer.demo.controller.v2.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.kafka.producer.demo.controller.VideoCallback;

public class VideoCallbackBackwardCompatibility extends VideoCallback {

    @JsonProperty("contact_info")
    public String contactInfo;

    @JsonProperty("ehr_id")
    public String ehrId;

    @JsonProperty("modality")
    public String modality;

    @JsonProperty("participant_source_id")
    public String participantSourceId;

    @JsonProperty("patient_id")
    public String patientId;

    @JsonProperty("room_source_id")
    public String roomSourceId;

    public VideoCallbackBackwardCompatibility(
        String status,
        String contactInfo,
        String ehrId,
        String modality,
        String participantSourceId,
        String patientId,
        String roomSourceId
    ) {
        super(status);
        this.contactInfo = contactInfo;
        this.ehrId = ehrId;
        this.modality = modality;
        this.participantSourceId = participantSourceId;
        this.patientId = patientId;
        this.roomSourceId = roomSourceId;
    }

    @Override
    public String toString() {
        return "VideoCallbackBackwardCompatibility{" +
            "status='" + status + '\'' +
            ", contactInfo='" + contactInfo + '\'' +
            ", ehrId='" + ehrId + '\'' +
            ", modality='" + modality + '\'' +
            ", participantSourceId='" + participantSourceId + '\'' +
            ", patientId='" + patientId + '\'' +
            ", roomSourceId='" + roomSourceId + '\'' +
            '}';
    }
}
