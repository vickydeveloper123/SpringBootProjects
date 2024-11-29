package com.example.demo.relationship.mode;

import java.util.ArrayList;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="Author")
public class Author {
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	
	@ManyToOne(cascade = CascadeType.ALL, fetch =FetchType.LAZY)
	
	@JoinColumn(name="Zip_Code")
	private ZipCode zipcode;
	
	@ManyToMany(mappedBy = "cateogories", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Book> books=new ArrayList<>();
	
	public Author(String name, ZipCode zipcode,List<Book> books) {
		this.name=name;
		this.zipcode=zipcode;
		this.books=books;
		
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void removeBook(Book book) {
		books.remove(book);
	}
	
	

}