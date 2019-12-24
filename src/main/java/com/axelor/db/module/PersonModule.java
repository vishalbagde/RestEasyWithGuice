package com.axelor.db.module;


import com.google.inject.Binder;
import com.google.inject.Module;
import com.axelor.db.rest.PersonApi;
import com.axelor.db.service.ContactService;
import com.axelor.db.service.ContactServiceImpl;
import com.axelor.db.service.PersonService;
import com.axelor.db.service.PersonServiceImpl;
import com.axelor.db.service.PhoneService;
import com.axelor.db.service.PhoneServiceImpl;


public class PersonModule implements Module {
	
	
	@Override
	public void configure(Binder binder) {
		binder.bind(PersonApi.class);
		binder.bind(PersonService.class).to(PersonServiceImpl.class);
		binder.bind(ContactService.class).to(ContactServiceImpl.class);
		binder.bind(PhoneService.class).to(PhoneServiceImpl.class);
	}
	/*
	@Override
	protected void configure() {
	
		//bind(PersonService.class).toProvider(PersonServiceProvider1.class);
	}
	*/
	
}
