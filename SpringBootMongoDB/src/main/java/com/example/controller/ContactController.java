package com.example.controller;

import com.example.model.Contact;
import com.example.model.User;
import com.example.repository.ContactRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ContactController {

    @Autowired
    ContactRepository contactRepository;

    @RequestMapping(method=RequestMethod.GET, value="/contacts")
    public Iterable<Contact> contact() {
        return contactRepository.findAll();
    }

    @RequestMapping(method=RequestMethod.POST, value="/contacts")
    public Contact save(@RequestBody Contact contact) {
        contactRepository.save(contact);

        return contact;
    }

    @RequestMapping(method=RequestMethod.GET, value="/contacts/{id}")
    public Contact show(@PathVariable String id) {
        return contactRepository.findOneById(id);
    }

    /*@RequestMapping(method=RequestMethod.PUT, value="/contacts/{id}")
    public Contact update(@PathVariable String id, @RequestBody Contact contact) {
        Contact c = contactRepository.findOneById(id);
        if(contact.getName() != null)
            c.setName(contact.getName());
        if(contact.getAddress() != null)
            c.setAddress(contact.getAddress());
        if(contact.getCity() != null)
            c.setCity(contact.getCity());
        if(contact.getPhone() != null)
            c.setPhone(contact.getPhone());
        if(contact.getEmail() != null)
            c.setEmail(contact.getEmail());
        contactRepository.save(c);
        return contact;
    }*/
   //update
  	@RequestMapping(method = RequestMethod.PUT, value="/contacts", consumes = MediaType.APPLICATION_JSON_VALUE)
  	public Contact update(@RequestBody Contact contact){
  		return contactRepository.save(contact);
  	}

    @RequestMapping(method=RequestMethod.DELETE, value="/contacts/{id}")
    public String delete(@PathVariable String id) {
        Contact contact = contactRepository.findOneById(id);
        contactRepository.delete(contact);

        return "";
    }
}
