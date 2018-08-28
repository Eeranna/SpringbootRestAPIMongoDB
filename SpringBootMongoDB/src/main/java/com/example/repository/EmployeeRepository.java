package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
	
	public Employee findOneById(int id);

    @Override
    void delete(Employee deleted);

}
