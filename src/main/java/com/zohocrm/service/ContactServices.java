package com.zohocrm.service;

import java.util.List;

import com.zohocrm.entities.Contact;

public interface ContactServices {
  public void SaveOneContact(Contact contact);

public List<Contact> findallcontact();

public Contact getallcontact(long id);

}
