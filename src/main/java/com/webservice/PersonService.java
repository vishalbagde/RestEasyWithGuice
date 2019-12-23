package com.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/person")
public class PersonService {
	
	
	@GET
	@Path("display")
	public String display()
	{
		return "Hello " ;
	}

}
