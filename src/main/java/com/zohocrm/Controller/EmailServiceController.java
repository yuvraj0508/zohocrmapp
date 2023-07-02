package com.zohocrm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.dto.email;
import com.zohocrm.utill.EmailService;
@Controller
public class EmailServiceController {
	@Autowired
	private EmailService emailservice;

	    @PostMapping("/sendemail")
	    public String getEmail(@RequestParam("email")String email ,ModelMap model) {
	    	model.addAttribute("email", email);
           return"compose_email";
	}
	    @PostMapping("/triggeremail")
	    public String sendEmail (email email,ModelMap model) {
	    	
	    	emailservice.SendEmail(email.getEmail(), email.getSubject(), email.getContent());
	    	model.addAttribute("msg", "email sent");
			return "compose_email";
	    	
	    }
}

