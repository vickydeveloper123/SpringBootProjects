package com.irctc.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassengerModel {
    private String passengerName;
    private String passengerSource;
    private String passengerDestination;
    private Double ticketPrice;
    private LocalDate journeyDate;
    private Integer trainNumber;
}


