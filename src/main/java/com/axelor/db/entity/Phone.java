package com.axelor.db.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Phone {
	
	@Id
	@GeneratedValue
	//(strategy = GenerationType.AUTO)
	int phone_id;
	String phone_type;
	String service_provider;
	
	@OneToOne(cascade = CascadeType.REMOVE)
	Contact contact;
	

	@Override
	public String toString() {
		return "Phone [phone_id=" + phone_id + ", phone_type=" + phone_type + ", service_provider=" + service_provider
				+ ", contact=" + contact + "]";
	}
	public Phone() {
		super();
	}
	public Phone(int phone_id, String phone_type, String service_provider, Contact contact) {
		super();
		this.phone_id = phone_id;
		this.phone_type = phone_type;
		this.service_provider = service_provider;
		this.contact = contact;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public int getPhone_id() {
		return phone_id;
	}
	public void setPhone_id(int phone_id) {
		this.phone_id = phone_id;
	}
	public String getPhone_type() {
		return phone_type;
	}
	public void setPhone_type(String phone_type) {
		this.phone_type = phone_type;
	}
	public String getService_provider() {
		return service_provider;
	}
	public void setService_provider(String service_provider) {
		this.service_provider = service_provider;
	}

}
