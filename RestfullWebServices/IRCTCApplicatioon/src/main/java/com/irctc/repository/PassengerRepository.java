package com.irctc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.irctc.entity.Passenger;
@Repository
public interface PassengerRepository extends JpaRepository<Passenger, String> {
	
}
