package com.hotel.service.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hotel.service.payload.HotelApiResponse;

@RestControllerAdvice
public class GlobalHotelExceptionHandler {

	/*
	 * @ExceptionHandler(HotelNotFoundException.class) public
	 * ResponseEntity<HotelApiResponse>handleHotelException(HotelNotFoundException
	 * ex){ String message = ex.getMessage(); HotelApiResponse response =
	 * HotelApiResponse.builder().message(message).status(HttpStatus.NOT_FOUND).
	 * success(true).build(); return new
	 * ResponseEntity<HotelApiResponse>(response,HttpStatus.NOT_FOUND);
	 * 
	 * }
	 */
	
	@ExceptionHandler(HotelNotFoundException.class)
	public ResponseEntity<Map<String,Object>>notFoundHandler(HotelNotFoundException ex){
		
		Map map = new HashMap();
		map.put("message", ex.getMessage() );
		map.put("status", HttpStatus.NOT_FOUND);
		map.put("success", false);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
		
	}
}
