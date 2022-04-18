package com.etiya.rentACar.business.responses.rentalResponses;

import com.etiya.rentACar.business.responses.orderedAdditionalServiceResponses.OrderedAdditionalServiceDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RentalDto {
    private int id;
    private LocalDate rentDate;
    private LocalDate returnDate;
    private String customerFirstName;
    private String customerLastName;
    private int customerId;
    private double dailyPrice;
    private String carDescription;
    private String rentCityName;
    private String returnCityName;

    List<OrderedAdditionalServiceDto> orderedAdditionalServices;
}
