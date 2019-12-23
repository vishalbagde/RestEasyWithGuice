package com.axelor.db.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.axelor.db.entity.Person;


public class PersonServiceImpl implements PersonService {
	
	@Inject private Provider<EntityManager> em;
	
	
	@Override
	public void deletePerson(Person person) {
		em.get().getTransaction().begin();
		em.get().remove(person);		
		em.get().getTransaction().commit();
	}
	@Override
	public void displayPerson(int person_id) {
		
		Person p = findPerson(person_id);
		System.out.println(p);
		
	}
	@Override
	public void insertPerson(Person person) {
		em.get().getTransaction().begin();
		em.get().persist(person);		
		em.get().getTransaction().commit();
	}
	
	@Override
	public void updatePerson(Person person) {
		em.get().getTransaction().begin();
		em.get().merge(person);		
		em.get().getTransaction().commit();
	}
	
	@Override
	public Person findPerson(int person_id) {
			Person p= em.get().find(Person.class, person_id);
			return p;
	}
	
	@Override
	public List<Person> getAllPerson() {
		
		em.get().getTransaction().begin();
		Query q=em.get().createQuery("from Person",Person.class);
		return q.getResultList();
		
	}

}
