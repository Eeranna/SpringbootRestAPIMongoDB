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

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/employee")
@RestController
public class EmployeeController {
	
		private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	    @Autowired
	    EmployeeRepository employeeRepository;
	 
	    //readAll
		@RequestMapping("/getAllEmployee")
		public List<Employee> readAllEmployee(){
			logger.info("inside getAllEmployee");
			return employeeRepository.findAll();
		}
		
		//create
		@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public void create(@RequestBody Employee employee){
			logger.info("inside create");
			employeeRepository.save(employee);
		}
		
		@RequestMapping(value="/{id}")
		public Employee read(@PathVariable int id){
			logger.info("inside read");
			return employeeRepository.findOneById(id);
		}

		//update
		@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
		public Employee update(@RequestBody Employee employee){
			logger.info("inside update");
			return employeeRepository.save(employee);
		}
		
		//delete
		@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
		public String delete(@PathVariable int id) {
			logger.info("inside delete");
			//User user = userRepository.findOneByName(name);
			Employee employee = employeeRepository.findOneById(id);
			employeeRepository.delete(employee);
			return "user deleted";
		     
		  }
}
