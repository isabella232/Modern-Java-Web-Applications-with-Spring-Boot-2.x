package org.packt.springboot22.vid03.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "location")
@Data
public class Location {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="delivery_date")
	private LocalDate deliveryDate;
	
	@Column(name="owner")
	private String owner;
	
	@Column(name="hid")
	private Long hid;

}
