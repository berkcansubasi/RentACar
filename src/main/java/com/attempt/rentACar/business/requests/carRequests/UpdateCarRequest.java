package com.etiya.rentACar.business.requests.carRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCarRequest {

    private int id;

    private double dailyPrice;

    private String description;
    private double kilometerInfo;
    private double modelYear;

    private int colorId;

    private int brandId;

    private String carStateName;

    private int cityId;



}
