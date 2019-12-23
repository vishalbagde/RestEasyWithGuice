package com.webservice;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

@Path("/bookservice")
public class BookService {
	
	@GET
	@Path("/status")
	public String getStatus() {
		return "hello world";
	}
	
	@GET
	@Path("/get/{user}")
	public Response getData(@PathParam("user") String msg) {
		String message = "Welcome " + msg +"!!!";
        return Response.status(200).entity(msg).build();
	}
	
	   @GET
	   @Path("{name}")
	   public String hello(@PathParam("name") final String name) {
	      return "Hello " + name;
	   }
	
}

