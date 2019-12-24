package com.axelor.db.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.axelor.db.entity.Contact;
import com.axelor.db.entity.Person;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;


public class ContactServiceImpl implements ContactService {

	@Inject
	private Provider<EntityManager> em;

	@Transactional
	@Override
	public void insertContact(Contact contact) {
		em.get().persist(contact);
	}

	@Transactional
	@Override
	public void updateContact(Contact contact) {
		em.get().persist(contact);
	}

	@Transactional
	@Override
	public void deleteContact(Contact contact) {
		em.get().remove(contact);
	}

	@Override
	public void displayContact(int contact_id) {
		Contact c = findContact(contact_id);
		System.out.println(c);

	}

	@Override
	public Contact findContact(int contact_id) {
		Contact c = em.get().find(Contact.class, contact_id);
		return c;
	}

	@Override
	public List<Contact> getAllContact() {
		// em.get().getTransaction().begin();
		Query q = em.get().createQuery("from Contact", Contact.class);
		return q.getResultList();
	}

}
