package com.axelor.db.service;

import java.util.List;

import com.axelor.db.Person;;

public interface PersonService {
	
	public void insertPerson(Person person);
	public void updatePerson(Person person);
	public void deletePerson(Person person);
	public void displayPerson(int  person_id);
	public Person findPerson(int person_id);
	public List<Person> getAllPerson();
	
	public List<Person> getPersonBySearch(String name);
	

}
