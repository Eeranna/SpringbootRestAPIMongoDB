package com.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserRepository userRepository;
	
	//readAll
	@RequestMapping("/all")
	public List<User> readAll(){
		logger.info("inside readAll");
		return userRepository.findAll();
	}
	
	//create
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void create(@RequestBody User user){
		logger.info("inside create");
		userRepository.save(user);
	}
	
	//read
	/*@RequestMapping(value="/{name}")
	public User read(@PathVariable String name){
		logger.info("inside read");
		return userRepository.findOneByName(name);
	}*/
	
	@RequestMapping(value="/{eid}")
	public User read(@PathVariable int eid){
		logger.info("inside read");
		return userRepository.findOneByEid(eid);
	}

	//update
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public User update(@RequestBody User user){
		logger.info("inside update");
		return userRepository.save(user);
	}
	
	//delete
	/*@RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
    public void delete(@PathVariable User id) {
		logger.info("inside delete");
        userRepository.delete(id); 
    }*/
	@RequestMapping(method=RequestMethod.DELETE, value="/{eid}")
	public String delete(@PathVariable int eid) {
		logger.info("inside delete");
		//User user = userRepository.findOneByName(name);
		User user = userRepository.findOneByEid(eid);
		userRepository.delete(user);
		return "user deleted";
	     
	  }
}
