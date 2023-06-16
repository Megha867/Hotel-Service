package com.me.hotelService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.me.hotelService.entities.Hotel;
import com.me.hotelService.services.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {

	@Autowired
	public HotelService hotelService;
	
	  @PostMapping 
	  public Hotel createHotel(@RequestBody Hotel hotel) 
	  {
	  return hotelService.createHotel(hotel);
	  }
	  
	  
	  @GetMapping("/{hotelId}")
	  public Hotel getHotelById(@PathVariable String hotelId) {
		  return hotelService.getHotelById(hotelId);
	  }
	  
	  @GetMapping
	  public List<Hotel> getListOfHotels(){
		  return hotelService.getListOfHotels();
	  }
	 

}
