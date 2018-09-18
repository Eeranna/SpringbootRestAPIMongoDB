package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.model.Contact;

public interface ContactRepository extends MongoRepository<Contact, String> {
	
	public Contact findOneById(String id);

    @Override
    void delete(Contact deleted);
}
