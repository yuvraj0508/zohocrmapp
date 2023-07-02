package com.zohocrm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Billing;
import com.zohocrm.entities.Contact;
import com.zohocrm.service.BillingServices;
import com.zohocrm.service.ContactServices;
@Controller
public class BillingController {
	@Autowired
	private ContactServices contactservice;
	
	@Autowired
	private BillingServices billservice;
	
	@RequestMapping("/Billinginfo")
	public String Billinginfo(@RequestParam("id")long id,ModelMap model) {
	Contact contact =	contactservice.getallcontact(id);
	model.addAttribute("contact", contact);
		return "Billing_lead";
	}
	@PostMapping("/SaveBill")
	public String SaveBiling(Billing billing,ModelMap model) {
		billservice.SaveBilling(billing);
	 List<Billing> billings = billservice.getallbill();
	model.addAttribute("billings", billings);
		return "Billing_table";
		
		

	}
}
