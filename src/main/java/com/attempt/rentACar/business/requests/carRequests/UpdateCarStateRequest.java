package com.etiya.rentACar.business.requests.carRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCarStateRequest {
    private int carId;
    private int cityId;
    private String carStateName;
    private double kilometerInfo;

}
