package com.irctc.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.irctc.entity.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, String> {
	
	Optional<Ticket> findByTicketPnr(String ticketPnr);

	Optional<Ticket> findByTicketId(String ticketId);
	
	
}
