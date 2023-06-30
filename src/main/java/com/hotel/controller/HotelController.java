package com.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.entity.Hotel;
import com.hotel.repository.HotelRepository;
import com.hotel.service.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
	private HotelService hotelService;
	
	@PostMapping()
	public ResponseEntity<Hotel> createUser(@RequestBody Hotel hotel) {
		Hotel createHotel = hotelService.createHotel(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(createHotel);
	}
	@PostMapping("/sampleHotel")
	public Hotel createOneHotel() {
		Hotel hotel = new Hotel();
		hotel.setHotelId("1");
		hotel.setName("IndraMahal");
		hotel.setLocation("Solapur");
		hotel.setAbout("Its services are good");
		
		return hotel;
		
	}
	
	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> getHotelById(@PathVariable String hotelId) {
		Hotel hotel = hotelService.getHotel(hotelId);
		return ResponseEntity.status(HttpStatus.OK).body(hotel);
	}
	@GetMapping()
	public ResponseEntity<List<Hotel>> getAllHotels() {
		List<Hotel> allHotel = hotelService.getAllHotel();
		return  ResponseEntity.ok(allHotel) ;
		
	}
}
