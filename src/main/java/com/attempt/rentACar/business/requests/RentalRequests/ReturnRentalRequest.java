package com.etiya.rentACar.business.requests.RentalRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturnRentalRequest {
    private int id;

    private LocalDate rentDate;

    private LocalDate returnDate;

    private int customerId;

    private int carId;

    private int rentCityId;

    private int returnCityId;

    private  int additionalServiceId;

    private double dailyPrice;

    private double endKilometer;
}
