package com.webservice;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class MyWebService extends Application {
	
	private Set<Object> singletons = new HashSet<Object>();

	public MyWebService() {
		singletons.add(new BookService());
		singletons.add(new PersonService());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
