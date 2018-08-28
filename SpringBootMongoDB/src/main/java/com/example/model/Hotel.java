package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "infotel")
public class Hotel {

	@Id
	private String _id;
	private String city;
	private String country;
	private String property_name;
	private String room_count;
	private String room_type;
	private String state;
	private String property_id;
	private String similar_hotel;
	private String address;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProperty_name() {
		return property_name;
	}

	public void setProperty_name(String property_name) {
		this.property_name = property_name;
	}

	public String getRoom_count() {
		return room_count;
	}

	public void setRoom_count(String room_count) {
		this.room_count = room_count;
	}

	public String getRoom_type() {
		return room_type;
	}

	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getProperty_id() {
		return property_id;
	}

	public void setProperty_id(String property_id) {
		this.property_id = property_id;
	}

	public String getSimilar_hotel() {
		return similar_hotel;
	}

	public void setSimilar_hotel(String similar_hotel) {
		this.similar_hotel = similar_hotel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
