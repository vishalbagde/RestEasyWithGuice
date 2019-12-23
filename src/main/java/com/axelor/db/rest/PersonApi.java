package com.axelor.db.rest;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.axelor.db.entity.Person;
import com.axelor.db.entity.PersonName;
import com.axelor.db.service.PersonService;
import com.google.inject.persist.PersistService;

@Path("/")
public class PersonApi {
	@Inject
	PersonService personservice;
	@POST
	@Path("/insert")
	public Response insertData(@FormParam("fname") String fname ,
			@FormParam("mname") String lname ,
			@FormParam("lname") String mname ,
			@FormParam("email") String email )
	{
		Person p = new Person(new PersonName(fname,mname,lname),email);
		personservice.insertPerson(p);
		return Response.status(200).entity("Insert successful").build();
	}
	@GET
	@Path("/get/{person_id}")
	public Response getDataByPersonId(@PathParam("person_id") String person_id)
	{	
		Person p = personservice.findPerson(2);
        return Response.status(200).entity(p.getEmail()).build();
		
	}
}
