package com.hotel.service.exception;

public class HotelNotFoundException extends RuntimeException {

	 public HotelNotFoundException(){
		 super("Hotel Not Found Exception");
	 }
     public HotelNotFoundException(String message){
		 super(message);
	 }
}
