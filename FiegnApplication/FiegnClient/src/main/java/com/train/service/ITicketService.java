package com.train.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.train.model.PassangerModel;
import com.train.model.TicketModel;

@FeignClient(name = "RestFull_IRCTC", url = "http://localhost:8090")
public interface ITicketService {

	@PostMapping("/bookTicket")
	TicketModel bookTicket(PassangerModel passangerModel);

	TicketModel getTicketByPnr(String pnr);

	// Ticket updateTicket(Passenger passenger,String ticketId);

	List<TicketModel> getAlltickets();

	String deleteTicket(String ticketId);

}
