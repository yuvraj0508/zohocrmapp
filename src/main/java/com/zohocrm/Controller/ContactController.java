package com.zohocrm.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contact;
import com.zohocrm.service.ContactServices;

@Controller
public class ContactController {
	
	private ContactServices contactservice;
	
	public ContactController(ContactServices contactservice) {
		
		this.contactservice = contactservice;
	}

	@RequestMapping("/contactlead")
	public String Contactlead(ModelMap model) {
		List<Contact> contacts = contactservice.findallcontact();
		model.addAttribute("contacts", contacts);
		return "contact_lead";
	}
	
}

