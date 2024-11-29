package com.irctc.service;

import java.util.List;

import com.irctc.entity.Passenger;
import com.irctc.entity.Ticket;
import com.irctc.model.PassengerModel;
import com.irctc.model.TicketModel;

public interface TicketService {
	
    public TicketModel bookTicket(PassengerModel passengerModel);
    public Ticket getTicket(String pnr);
    public Ticket updateTicket(Passenger passenger, String ticketId);
    public String deleteTicket(String ticketId);
    public String deleteAllTickets();
    public List<Ticket> getAllTickets();
}
