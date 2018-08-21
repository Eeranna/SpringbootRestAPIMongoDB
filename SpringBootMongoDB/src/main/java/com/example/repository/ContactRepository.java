package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Contact;

public interface ContactRepository extends CrudRepository<Contact, String> {
	
	public Contact findOneById(String id);

    @Override
    void delete(Contact deleted);
}
