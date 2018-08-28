package com.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Hotel;
import com.example.repository.HotelRepository;


@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/hotel")
@RestController
public class HotelController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    HotelRepository hotelRepository;
 
    //getAllHotels
	@RequestMapping("/getAllHotels")
	public List<Hotel> getAllHotels(){
		logger.info("inside getAllHotels");
		return hotelRepository.findAll();
	}

}
