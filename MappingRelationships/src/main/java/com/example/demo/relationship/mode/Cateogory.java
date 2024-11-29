package com.example.demo.relationship.mode;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="Cateogory")
public class Cateogory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	@OneToMany(mappedBy = "Cateogory" , cascade=CascadeType.ALL , fetch = FetchType.LAZY)
	private List<Book> books=new ArrayList<>();
	public Cateogory(String name, List<Book> books) {
		super();
		this.name = name;
		this.books = books;
	}
	
	
	
	

}