package com.irctc.entity;

import java.time.LocalDate;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Passenger {
	@Id
	@GeneratedValue(generator = "passenger_id_generator")
	@GenericGenerator(name = "passenger_id_generator", strategy = "com.irctc.generator.PassengerIdGenerator")
	@Column(name = "passenger_id", nullable = false, updatable = false)
	private String passengerId;
	private String passengerName;
	private String passengerSource;
	private String passengerDestination;
	private Double ticketPrice;
	@CreationTimestamp
	private LocalDate journeyDate;
	private Integer trainNumber;
}
