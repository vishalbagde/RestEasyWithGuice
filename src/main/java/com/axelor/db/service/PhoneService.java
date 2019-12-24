package com.axelor.db.service;

import java.util.List;

import com.axelor.db.entity.Phone;

public interface PhoneService {
	
	public void insertPhone(Phone phone);
	public void updatePhone(Phone phone);
	public void deletePhone(Phone phone);
	public void displayPhone(int  phone_id);
	public Phone findPhone(int phone_id);
	public List<Phone> getAllPhone();

}
