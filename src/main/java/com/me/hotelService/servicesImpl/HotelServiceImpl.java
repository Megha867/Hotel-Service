package com.me.hotelService.servicesImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.hotelService.entities.Hotel;
import com.me.hotelService.repositiories.HotelRepository;
import com.me.hotelService.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	public HotelRepository hotelRepository;

	@Override
	public Hotel createHotel(Hotel hotel) {
		String hotelId = UUID.randomUUID().toString();
		hotel.setHotelId(hotelId);
		return hotelRepository.save(hotel);
	}

	@Override
	public Hotel getHotelById(String hotelId) {
		return hotelRepository.findById(hotelId).get();
	}

	@Override
	public List<Hotel> getListOfHotels() {
		return hotelRepository.findAll();
	}

}
