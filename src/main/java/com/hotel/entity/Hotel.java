package com.hotel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "micro_hotel")
@Setter
@Getter
public class Hotel {
	
    @Id
    @Column(name = "ID")
	private String hotelId;
    @Column(name = "NAME")
	private String name;
    @Column(name = "LOCATION")
	private String location;
    @Column(name = "ABOUT")
	private String about;
}
