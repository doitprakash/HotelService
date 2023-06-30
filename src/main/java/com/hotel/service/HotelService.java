package com.hotel.service;

import java.util.List;

import com.hotel.entity.Hotel;

public interface HotelService {

	//Create
	Hotel createHotel(Hotel hotel);
	//getAll
	 List<Hotel>getAllHotel();
	//get
	Hotel getHotel(String hotelId);
	
}
