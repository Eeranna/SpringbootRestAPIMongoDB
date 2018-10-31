package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.Zomato;

public interface ZomatoRepository extends MongoRepository<Zomato, String>{

}
