package com.zohocrm.utill;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;


@Component
public class EmailServiceImpl implements EmailService {

	@Autowired
	private JavaMailSender emailsender;
	@Override

	public void SendEmail(String to, String subject, String emailbody) {
		SimpleMailMessage meassage = new SimpleMailMessage();
		meassage.setTo(to);
		meassage.setSubject(subject);
		meassage.setText(emailbody);
		emailsender.send(meassage);

	}

}
