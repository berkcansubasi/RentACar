package com.etiya.rentACar.business.responses.orderedAdditionalServiceResponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderedAdditionalServiceDto {
    private int id;
    private int rentalId;
    private int additionalServiceId;
    private String additionalServiceName;
    private int additionalServicePrice;
}
