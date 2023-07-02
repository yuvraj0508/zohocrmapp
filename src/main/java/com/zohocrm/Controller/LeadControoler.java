package com.zohocrm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;
import com.zohocrm.service.ContactServices;
import com.zohocrm.service.LeadService;

@Controller
public class LeadControoler {
	@Autowired         
	private LeadService leadrepo; 
	@Autowired
	private ContactServices contactservice;
	
@GetMapping("/Viewcreatepage")
	public String Viewcreatepage() {
		return "create_new_page";
		
	}
	@PostMapping("/save")
	public String saveOneLead(@ModelAttribute("lead")Lead lead,ModelMap model) {
		leadrepo.saveonelead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
		
	}
	@PostMapping("/covertlead")
	public String ConvertLead(@RequestParam("id")long id,ModelMap model) {
	Lead lead	=leadrepo.finById(id);
	Contact contact = new Contact();
	contact.setFirstname(lead.getFirstname());
	contact.setLastname(lead.getLastname());
	contact.setEmail(lead.getEmail());
	contact.setMobile(lead.getMobile());
	contact.setSource(lead.getSource());
	
	contactservice.SaveOneContact(contact);
	
	leadrepo.deleteById(id);
	List<Contact> contacts = contactservice.findallcontact();
	model.addAttribute("contacts", contacts);
	return "contact_lead";
	}  
	@RequestMapping("/getalllead")
	public String GetallLeads(ModelMap model) {
		List<Lead> lead = leadrepo.getalllead();
		model.addAttribute("lead", lead);
		return "list_lead";
	}
	@RequestMapping("/leadinfo")
	public String leadinfo(@RequestParam("id")long id,ModelMap model) {
		Lead lead = leadrepo.finById(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
		
}
