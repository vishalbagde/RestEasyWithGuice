package com.axelor.db.module;

import com.google.inject.AbstractModule;
import com.google.inject.Binder;
import com.google.inject.Module;
import com.axelor.db.rest.PersonApi;
import com.axelor.db.service.PersonService;
import com.axelor.db.service.PersonServiceImpl;


public class PersonModule implements Module {
	
	
	@Override
	public void configure(Binder binder) {
		binder.bind(PersonApi.class);
		binder.bind(PersonService.class).to(PersonServiceImpl.class);
		
	}
	/*
	@Override
	protected void configure() {
	
		//bind(PersonService.class).toProvider(PersonServiceProvider1.class);
	}
	*/
	
}
