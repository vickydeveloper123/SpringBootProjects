package com.train.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.train.binding.PassengerBinding;

import com.train.binding.TicketBinding;
import com.train.entity.Passenger;
import com.train.entity.Ticket;
import com.train.exception.TicketNotFoundException;
import com.train.model.PassangerModel;
import com.train.model.TicketModel;
import com.train.responce.ResponceHandler;
import com.train.service.TicketService;

@RestController
public class IRCTCController {

	private TicketService service;

	public IRCTCController(TicketService service) {
		super();
		this.service = service;
	}

	@PostMapping(value = "/bookTicket", consumes = { "application/xml", "application/json" }, produces = {
			"application/json", "application/xml" })
	public ResponseEntity<TicketBinding> bookTicket(@RequestBody PassengerBinding passengerBinding) {

		PassangerModel passengerModel = new PassangerModel();
		System.err.println(passengerBinding.getJourneyDate());
		passengerModel.setName(passengerBinding.getName());
		passengerModel.setSource(passengerBinding.getSource());
		passengerModel.setJourneyDate(passengerBinding.getJourneyDate());
		passengerModel.setDestination(passengerBinding.getDestination());
		passengerModel.setTrainNumber(passengerBinding.getTrainNumber());

		TicketModel ticketModel = service.bookTicket(passengerModel);

		TicketBinding ticketBinding = new TicketBinding();
		ticketBinding.setName(ticketModel.getName());
		ticketBinding.setTicketId(ticketModel.getTicketId());
		ticketBinding.setSource(ticketModel.getSource());
		ticketBinding.setJourneyDate(ticketModel.getJourneyDate());
		ticketBinding.setDestination(ticketModel.getDestination());
		ticketBinding.setPnr(ticketModel.getPnr());
		ticketBinding.setTicketStatus(ticketModel.getTicketStatus());
		ticketBinding.setTrainNumber(ticketModel.getTrainNumber());
		return new ResponseEntity<>(ticketBinding, HttpStatus.CREATED);

	}

	

	
	@GetMapping(value = "/getTicket/{pnr}", produces = { "application/json", "application/xml" })
	public ResponseEntity<TicketBinding> getTicket(@PathVariable String pnr) throws TicketNotFoundException 
	{
	    TicketModel ticketByPnr = service.getTicketByPnr(pnr);
	    TicketBinding ticketBinding = new TicketBinding();
	    ticketBinding.setTicketId(ticketByPnr.getTicketId());
	    ticketBinding.setName(ticketByPnr.getName());
	    ticketBinding.setSource(ticketByPnr.getSource());
	    ticketBinding.setJourneyDate(ticketByPnr.getJourneyDate());
	    ticketBinding.setDestination(ticketByPnr.getDestination());
	    ticketBinding.setPnr(ticketByPnr.getPnr());
	    ticketBinding.setTicketStatus(ticketByPnr.getTicketStatus());
	    ticketBinding.setTrainNumber(ticketByPnr.getTrainNumber());

	    return new ResponseEntity<>(ticketBinding, HttpStatus.OK);
	}


	@PutMapping(value = "/updateTicket/{ticketId}", consumes = { "application/xml", "application/json" }, produces = {
			"application/json", "application/xml" })
	public ResponseEntity<?> updateTicket(@RequestBody Passenger passenger, @PathVariable String ticketId) {

		Ticket updateTicket = service.updateTicket(passenger, ticketId);
		return new ResponseEntity<Ticket>(updateTicket, HttpStatus.FOUND);
	}

	@GetMapping(value = "/getAllTickets", produces = { "application/json", "application/xml" })
	public ResponseEntity<List<TicketBinding>> getAllTicket() throws TicketNotFoundException {
		List<TicketModel> allTickets = service.getAlltickets();

		List<TicketBinding> ticketBindings = allTickets.stream().map(ticketModel -> {
			TicketBinding ticketBinding = new TicketBinding();
			ticketBinding.setName(ticketModel.getName());
			ticketBinding.setTicketId(ticketModel.getTicketId());
			ticketBinding.setSource(ticketModel.getSource());
			ticketBinding.setJourneyDate(ticketModel.getJourneyDate());
			ticketBinding.setDestination(ticketModel.getDestination());
			ticketBinding.setPnr(ticketModel.getPnr());
			ticketBinding.setTicketStatus(ticketModel.getTicketStatus());
			ticketBinding.setTrainNumber(ticketModel.getTrainNumber());
			return ticketBinding;
		}).collect(Collectors.toList());

		return ResponseEntity.ok(ticketBindings);
	}

	@DeleteMapping("/deleteTicket/{ticketId}")
	public ResponseEntity<String> deleteTicket(@PathVariable String ticketId) throws TicketNotFoundException {
		String deleteTicket = service.deleteTicket(ticketId);
		return new ResponseEntity<String>(deleteTicket, HttpStatus.OK);
	}

}
