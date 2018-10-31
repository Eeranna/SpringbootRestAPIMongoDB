package com.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Zomato;
import com.example.repository.ZomatoRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/zomato")
@RestController
public class ZomatoController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    ZomatoRepository zomatoRepository;
 
	@RequestMapping("/getZomatoDetails")
	public List<Zomato> getZomatoDetails(){
		logger.info("inside getZomatoDetails");
		return zomatoRepository.findAll();
	}

}
