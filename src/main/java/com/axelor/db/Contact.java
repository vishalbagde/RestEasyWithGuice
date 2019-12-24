package com.axelor.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	int Contact_id;
	String phone_no;
	
	public Contact(int contact_id, String phone_no) {
		super();
		Contact_id = contact_id;
		this.phone_no = phone_no;
	}
	public Contact() {
		super();
	}
	
	public int getContact_id() {
		return Contact_id;
	}
	public void setContact_id(int contact_id) {
		Contact_id = contact_id;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	
}
