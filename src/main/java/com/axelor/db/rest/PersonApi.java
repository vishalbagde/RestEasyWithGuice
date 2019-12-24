package com.axelor.db.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.jboss.resteasy.plugins.providers.html.View;

import com.axelor.db.entity.Address;
import com.axelor.db.entity.Contact;
import com.axelor.db.entity.Person;
import com.axelor.db.entity.PersonName;
import com.axelor.db.entity.Phone;
import com.axelor.db.service.ContactService;
import com.axelor.db.service.PersonService;
import com.axelor.db.service.PhoneService;
import com.google.inject.persist.PersistService;

@Path("/")
public class PersonApi {
	@Inject
	PersonService personservice;
	@Inject 
	ContactService contactservice;
	@Inject
	PhoneService phoneservice;
	
	@POST
	@Path("/insert")
	public Response insertData(@FormParam("fname") String fname ,
			@FormParam("mname") String mname ,
			@FormParam("lname") String lname ,
			@FormParam("email") String email )
	{
		Person p = new Person(new PersonName(fname,mname,lname),email);
		personservice.insertPerson(p);
		return Response.status(200).entity("Insert successful").build();
	}
	@GET
	@Path("/get/{person_id}")
	public Response getDataByPersonId(@PathParam("person_id") int person_id)
	{	
		Person p = personservice.findPerson(person_id);
        return Response.status(200).entity(p.getEmail()).build();
		
	}
	@GET
	@Path("/getAll")
	public View getDataAll()
	{	
		List<Person> p = personservice.getAllPerson();
		return new View("/display.jsp",p,"personData");    
	}
	@GET
	@Path("/personUpdateFetch/{person_id}")
	public View getDataAll(@PathParam("person_id") int person_id)
	{	
		Person p = personservice.findPerson(person_id);
		return new View("/update.jsp",p,"personData");    
	}

	
	@POST
	@Path("/update/{person_id}")
	public Response updateData(@FormParam("fname") String fname ,
			@FormParam("mname") String mname ,
			@FormParam("lname") String lname ,
			@FormParam("email") String email ,
			@PathParam("person_id") int person_id)
	{
		Person p = personservice.findPerson(person_id);
		PersonName pname=p.getPersonName();
		p.setEmail(email);
		pname.setFname(fname);
		pname.setMname(mname);
		pname.setLname(lname);
		personservice.updatePerson(p);
		return Response.status(200).entity("Update successful").build();
	}
	
	@GET
	@Path("/delete/{person_id}")
	public View deleteData(@PathParam("person_id") int person_id)
	{
		Person p = personservice.findPerson(person_id);
		personservice.deletePerson(p);
		//return Response.status(200).entity("Delete successful").build();
		return this.getDataAll();
	}
	
	@GET
	@Path("/getPersonForSelect")
	public Response getPersonForSelect()
	{
		String data="";
		List<Person> plist = personservice.getAllPerson();
		for (Person person : plist) {
			Address address = person.getAddress();
			if(address!=null)
				data +="<option value='"+address.getAddress_id()+"'>"+address.getPloat_no()+"-"+address.getArea()+"</option>";
		}
		System.out.println(data);
		return Response.status(200).entity(data).build();
	}
	
	@POST
	@Path("/addContact")
	public Response addContact(@FormParam("phone_type") String ptype,
			@FormParam("contact_no") String cno ,
			@FormParam("service_provider") String ser_pro ,
			@FormParam("person_id") int person_id)
	{
		Person p = personservice.findPerson(person_id);
		
		List<Phone> phone=p.getPhone();
		Contact c=new Contact();
		c.setPhone_no(cno);
		contactservice.insertContact(c);
		
		Phone ph=new Phone(0,ptype,ser_pro,c);
		phoneservice.insertPhone(ph);
	
		phone.add(ph);
		
		p.setPhone(phone);

		personservice.updatePerson(p);
		return Response.status(200).entity("Contact Added successful").build();
	}
	
	@GET
	@Path("/getContact/{person_id}")
	public View getContact(@PathParam("person_id") int person_id)
	{
		Person p = personservice.findPerson(person_id);
		
		return new View("/contactDisplay.jsp",p,"contactData");
	}	
}