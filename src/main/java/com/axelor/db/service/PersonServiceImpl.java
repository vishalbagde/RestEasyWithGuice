package com.axelor.db.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.axelor.db.Person;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;


public class PersonServiceImpl implements PersonService {
	
	@Inject private Provider<EntityManager> em;
	
	
	@Transactional
	@Override
	public void deletePerson(Person person) {
		em.get().remove(person);		
	}
	@Override
	public void displayPerson(int person_id) {
		Person p = findPerson(person_id);
		System.out.println(p);
	}
	@Transactional
	@Override
	public void insertPerson(Person person) {
		em.get().persist(person);		
	}
	
	@Transactional
	@Override
	public void updatePerson(Person person) {
		em.get().persist(person);		
	}
	
	
	@Override
	public Person findPerson(int person_id) {
			Person p= em.get().find(Person.class, person_id);
			return p;
	}
	
	@Override
	public List<Person> getAllPerson() {
		
		//em.get().getTransaction().begin();
		Query q=em.get().createQuery("from Person",Person.class);
		return q.getResultList();
		
	}
	
	@Override
	public List<Person> getPersonBySearch(String name) {
		Query q = em.get().createQuery("from Person where fname like :b").setParameter("b", name);
		List<Person> list =q.getResultList();
		return list;
	
	}

}
