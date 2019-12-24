package com.axelor.db.service;

import java.util.List;

import com.axelor.db.Contact;

public interface ContactService {
	public void insertContact(Contact contact);
	public void updateContact(Contact contact);
	public void deleteContact(Contact contact);
	public void displayContact(int  contact_id);
	public Contact findContact(int contact_id);
	public List<Contact> getAllContact();

}
