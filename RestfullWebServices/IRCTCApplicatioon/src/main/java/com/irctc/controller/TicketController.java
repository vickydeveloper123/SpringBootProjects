package com.irctc.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.binding.PassengerBinding;
import com.irctc.binding.TicketBinding;
import com.irctc.entity.Passenger;
import com.irctc.entity.Ticket;
import com.irctc.model.PassengerModel;
import com.irctc.model.TicketModel;
import com.irctc.service.TicketService;

@RestController
@RequestMapping("/tickets")

@CrossOrigin(origins = "", allowedHeaders = "", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE })
public class TicketController {

	private TicketService service;

	public TicketController(TicketService service) {
		this.service = service;
	}

	@PostMapping("/bookTicket") // produces = {"application/json","application/xml"}, consumes =
								// {"application/json","application/xml"}
	public ResponseEntity<TicketBinding> bookTicket(@RequestBody PassengerBinding passengerBinding) {
		PassengerModel passengerModel = new PassengerModel();
		passengerModel.setPassengerName(passengerBinding.getPassengerName());
		passengerModel.setPassengerSource(passengerBinding.getPassengerSource());
		passengerModel.setPassengerDestination(passengerBinding.getPassengerDestination());
		passengerModel.setTrainNumber(passengerBinding.getTrainNumber());
		passengerModel.setJourneyDate(passengerBinding.getJourneyDate());
		passengerModel.setTicketPrice(passengerBinding.getTicketPrice());

		TicketModel ticketModel = service.bookTicket(passengerModel);

		TicketBinding ticketBinding = new TicketBinding();
		ticketBinding.setPassengerName(ticketModel.getPassengerName());
		ticketBinding.setTicketId(ticketModel.getTicketId());
		ticketBinding.setPassengerSource(ticketModel.getPassengerSource());
		ticketBinding.setJourneyDate(ticketModel.getJourneyDate());
		ticketBinding.setPassengerDestination(ticketModel.getPassengerDestination());
		ticketBinding.setTicketPnr(ticketModel.getTicketPnr());
		ticketBinding.setTicketStatus(ticketModel.getTicketStatus());
		ticketBinding.setTrainNumber(ticketModel.getTrainNumber());
		ticketBinding.setTicketPrice(ticketModel.getTicketPrice());

		return new ResponseEntity<>(ticketBinding, HttpStatus.CREATED);
	}

	@GetMapping(value = "/getTicket/{pnr}", produces = { "application/json", "application/xml" }, consumes = {
			"application/json", "application/xml" })
	public ResponseEntity<Object> getTicket(@PathVariable("pnr") String pnr) {
		Ticket getTicket = service.getTicket(pnr);
		if (getTicket != null) {
			return new ResponseEntity<>(getTicket, HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Ticket Not Found", HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping(value = "/updateTicket/{ticketId}", produces = { "application/json", "application/xml" }, consumes = {
			"application/json", "application/xml" })
	public ResponseEntity<Ticket> updateTicket(@RequestBody Passenger passenger,
			@PathVariable("ticketId") String ticketId) {
		Ticket updateTicket = service.updateTicket(passenger, ticketId);
		if (updateTicket != null) {
			return new ResponseEntity<>(updateTicket, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping(value = "/getAllTickets", produces = { "application/json", "application/xml" }) // consumes =
																								// {"application/json","application/xml"}
	public ResponseEntity<List<Ticket>> getAllTickets() {
		List<Ticket> allTickets = service.getAllTickets();
		return new ResponseEntity<>(allTickets, HttpStatus.OK);
	}

	@DeleteMapping("/deleteTicket/{ticketId}")
	public ResponseEntity<String> deleteTicket(@PathVariable("ticketId") String ticketId) {
		String response = service.deleteTicket(ticketId);
		if (response.contains("Not Found")) {
			return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
	}

	@DeleteMapping("/deleteAllTickets")
	public ResponseEntity<String> deleteAllTickets() {
		String response = service.deleteAllTickets();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
