package com.zohocrm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Repository.LeadRepository;
import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;
@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepository leadrepo;
	
	@Override
	public void saveonelead(Lead lead) {
  leadrepo.save(lead);
	}
	@Override
	public Lead finById(long id) {
		Optional<Lead> findById = leadrepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}
	@Override 
	public void deleteById(long id) {
	    leadrepo.deleteById(id);
		
	}
	@Override
	public List<Lead> getalllead() {
		List<Lead> lead = leadrepo.findAll();
		return lead;
	}

	


}
