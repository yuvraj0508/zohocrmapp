package com.zohocrm.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Repository.BillingRepository;
import com.zohocrm.entities.Billing;

@Service
public class BillingServicesImpl implements BillingServices {

	@Autowired
	private BillingRepository billrepo;
	@Override
	public void SaveBilling(Billing billing) {
		billrepo.save(billing);
		
	}
	@Override
	public List<Billing> getallbill() {
		List<Billing> billings = billrepo.findAll();
		return billings;
	}
	
}
