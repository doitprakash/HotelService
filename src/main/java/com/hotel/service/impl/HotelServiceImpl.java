package com.hotel.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.entity.Hotel;
import com.hotel.repository.HotelRepository;
import com.hotel.service.HotelService;
import com.hotel.service.exception.HotelNotFoundException;

@Service
public class HotelServiceImpl implements HotelService {
    
	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public Hotel createHotel(Hotel hotel) {
		 String randomString = UUID.randomUUID().toString();
		 hotel.setHotelId(randomString);
		 
		return hotelRepository.save(hotel) ;
	}

	@Override
	public List<Hotel> getAllHotel() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getHotel(String hotelId) {
		// TODO Auto-generated method stub
		return hotelRepository.findById(hotelId).orElseThrow(()->new HotelNotFoundException("Hotel with id not found"+hotelId));
	}

	
	
	
}
