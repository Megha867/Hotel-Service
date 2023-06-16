package com.me.hotelService.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hotel")
public class Hotel {
	
	@Id
	private String hotelId;
	private String name;
	private String location;
	private String about;
	
	public Hotel() {
		super();
	}

	public Hotel(String hotelId, String name, String location, String about) {
		super();
		this.hotelId = hotelId;
		this.name = name;
		this.location = location;
		this.about = about;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
	
}
