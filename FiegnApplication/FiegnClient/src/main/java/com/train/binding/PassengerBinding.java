package com.train.binding;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassengerBinding {
	
	
	private String name;

	private String source;

	private String destination;
	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate journeyDate;

    private Double fare;

	private Long trainNumber;
	


}
