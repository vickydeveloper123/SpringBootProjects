package com.example.demo.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;

import java.util.List;

import jakarta.persistence.*;
import jakarta.persistence.ManyToMany;

public class UserDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roleId;
	
	private String roleName;
	
	
	@ManyToMany
	@JoinTable(
	        name = "user_primary_key",
	        joinColumns = @JoinColumn(name = "user_id"),
	        inverseJoinColumns = @JoinColumn(name = "role_id")
	    )
	private List<UserDetails> user;


}
