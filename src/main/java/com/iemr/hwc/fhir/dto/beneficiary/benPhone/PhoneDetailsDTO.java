package com.iemr.hwc.fhir.dto.beneficiary.benPhone;

import lombok.Data;

@Data
public class PhoneDetailsDTO {
    private String phoneNo;
    private Integer vanID;
    private Integer parkingPlaceID;
    private String createdBy;
}
