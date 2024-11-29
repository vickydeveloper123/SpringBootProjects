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
public class Ticket {
    @Id
    @GeneratedValue(generator = "ticket_id_generator")
    @GenericGenerator(name = "ticket_id_generator", strategy = "com.irctc.generator.TicketIdGenerator")
    @Column(name = "ticket_id", nullable = false, updatable = false)
    private String ticketId;
    private String passengerName;
    private String passengerSource;
    private String passengerDestination;
    private Double ticketPrice;
    @CreationTimestamp
    private LocalDate journeyDate;
    private Integer trainNumber;
    private String ticketPnr;
    private String ticketStatus;
}
