package com.zohocrm.service;

import java.util.List;

import com.zohocrm.entities.Billing;

public interface BillingServices {
public  void SaveBilling(Billing billing);

public List<Billing> getallbill();
}
