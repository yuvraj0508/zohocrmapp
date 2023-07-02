package com.zohocrm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Repository.ContactRepository;
import com.zohocrm.entities.Contact;
@Service
public class ContactServiceImpl implements ContactServices {

	@Autowired
	private ContactRepository contactrepo;
	@Override
	public void SaveOneContact(Contact contact) {
	contactrepo.save(contact);

	}
	@Override
	public List<Contact> findallcontact() {
		List<Contact> contacts = contactrepo.findAll();
		
		return contacts;
	}
	@Override
	public Contact getallcontact(long id) {
Optional<Contact> findById = contactrepo.findById(id);
Contact contact = findById.get();
		return contact;
	}

	
	
	

}
