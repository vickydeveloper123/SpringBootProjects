package com.example.demo.relationship.mode;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "ZipCode")
public class ZipCode {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "city_id")
	private City city;

	public ZipCode(String name, City city) {
		this.name = name;
		this.city = city;

	}

}
