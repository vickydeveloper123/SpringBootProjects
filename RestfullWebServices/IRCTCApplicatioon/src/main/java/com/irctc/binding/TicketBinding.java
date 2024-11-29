package com.irctc.binding;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketBinding {
	private String ticketId;
	private String passengerName;
	private String passengerSource;
	private String passengerDestination;
	private Double ticketPrice;
	private LocalDate journeyDate;
	private Integer trainNumber;
	private String ticketPnr;
	private String ticketStatus;
}
