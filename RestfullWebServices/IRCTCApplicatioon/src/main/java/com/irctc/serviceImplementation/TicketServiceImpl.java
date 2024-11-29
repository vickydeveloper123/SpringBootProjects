package com.irctc.serviceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.irctc.entity.Passenger;
import com.irctc.entity.Ticket;
import com.irctc.model.PassengerModel;
import com.irctc.model.TicketModel;
import com.irctc.repository.PassengerRepository;
import com.irctc.repository.TicketRepository;
import com.irctc.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

	private PassengerRepository passengerRepo;
	private TicketRepository ticketRepo;

	public TicketServiceImpl(PassengerRepository passengerRepo, TicketRepository ticketRepo) {
		this.passengerRepo = passengerRepo;
		this.ticketRepo = ticketRepo;
	}

	@Override
	public TicketModel bookTicket(PassengerModel passengerModel) {
		Passenger passenger = new Passenger();
		passenger.setPassengerName(passengerModel.getPassengerName());
		passenger.setPassengerSource(passengerModel.getPassengerSource());
		passenger.setPassengerDestination(passengerModel.getPassengerDestination());
		passenger.setTrainNumber(passengerModel.getTrainNumber());
		passenger.setJourneyDate(passengerModel.getJourneyDate());
		passenger.setTicketPrice(passengerModel.getTicketPrice());

		Passenger savedPassenger = passengerRepo.save(passenger);
		String pnr = "";
		for (int i = 0; i < 10; i++) {
			pnr += (int) (Math.random() * 10);
		}

		Ticket ticketInfo = new Ticket();
		ticketInfo.setTicketPnr(pnr);
		ticketInfo.setTicketStatus("Confirmed");
		ticketInfo.setTrainNumber(savedPassenger.getTrainNumber());
		ticketInfo.setPassengerName(savedPassenger.getPassengerName());
		ticketInfo.setPassengerSource(savedPassenger.getPassengerSource());
		ticketInfo.setPassengerDestination(savedPassenger.getPassengerDestination());
		ticketInfo.setJourneyDate(savedPassenger.getJourneyDate());
		ticketInfo.setTicketPrice(savedPassenger.getTicketPrice());

		Ticket savedTicket = ticketRepo.save(ticketInfo);
		TicketModel ticketModel = new TicketModel();
		ticketModel.setTicketId(savedTicket.getTicketId());
		ticketModel.setPassengerName(savedTicket.getPassengerName());
		ticketModel.setJourneyDate(savedTicket.getJourneyDate());
		ticketModel.setPassengerSource(savedTicket.getPassengerSource());
		ticketModel.setPassengerDestination(savedTicket.getPassengerDestination());
		ticketModel.setTicketPnr(savedTicket.getTicketPnr());
		ticketModel.setTicketStatus(savedTicket.getTicketStatus());
		ticketModel.setTrainNumber(savedTicket.getTrainNumber());
		ticketModel.setTicketPrice(savedTicket.getTicketPrice());

		return ticketModel;
	}

	@Override
	public Ticket getTicket(String pnr) {
		Optional<Ticket> ticketOutput = ticketRepo.findByTicketPnr(pnr);
		return ticketOutput.orElse(null);
	}

	@Override
	public Ticket updateTicket(Passenger passenger, String ticketId) {
		Optional<Ticket> ticketUpdate = ticketRepo.findByTicketId(ticketId);

		if (ticketUpdate.isPresent()) {
			Ticket ticketInfo = ticketUpdate.get();

			String pnr = "";
			for (int i = 0; i < 10; i++) {
				pnr += (int) (Math.random() * 10);
			}

			ticketInfo.setTicketStatus("Confirmed");
			ticketInfo.setTicketPnr(pnr);
			ticketInfo.setTrainNumber(passenger.getTrainNumber());
			ticketInfo.setPassengerName(passenger.getPassengerName());
			ticketInfo.setPassengerSource(passenger.getPassengerSource());
			ticketInfo.setPassengerDestination(passenger.getPassengerDestination());
			ticketInfo.setJourneyDate(passenger.getJourneyDate());
			ticketInfo.setTicketPrice(passenger.getTicketPrice());

			ticketRepo.save(ticketInfo);
			

			return ticketInfo;

	        
		}
		return null;
	}

	@Override
	public String deleteTicket(String ticketId) {
		if (ticketRepo.existsById(ticketId)) {
			ticketRepo.deleteById(ticketId);
			passengerRepo.deleteById(ticketId);
			return "Ticket Deleted Successfully";
		}
		return "Ticket Not Found";
	}

	@Override
	public String deleteAllTickets() {
		ticketRepo.deleteAll();
		passengerRepo.deleteAll();
		return "All tickets deleted successfully";
	}

	@Override
	public List<Ticket> getAllTickets() {
		return ticketRepo.findAll();
	}
}
