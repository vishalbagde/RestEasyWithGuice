package com.axelor.db.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.axelor.db.entity.Person;
import com.axelor.db.entity.Phone;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;

public class PhoneServiceImpl implements PhoneService {

	@Inject
	private Provider<EntityManager> em;
	
	@Transactional
	@Override
	public void insertPhone(Phone phone) {
		em.get().persist(phone);
	}

	@Transactional
	@Override
	public void updatePhone(Phone phone) {		
		em.get().persist(phone);
	}
	
	@Transactional
	@Override
	public void deletePhone(Phone phone) {
		em.get().remove(phone);

	}

	@Override
	public void displayPhone(int phone_id) {
		Phone p = findPhone(phone_id);
		System.out.println(p);

	}

	@Override
	public Phone findPhone(int phone_id) {
		Phone p = em.get().find(Phone.class, phone_id);
		return p;

	}

	@Override
	public List<Phone> getAllPhone() {
		Query q = em.get().createQuery("from Phone", Phone.class);
		return q.getResultList();
	}

}
