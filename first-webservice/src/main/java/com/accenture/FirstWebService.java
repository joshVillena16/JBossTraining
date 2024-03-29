package com.accenture;

import java.util.List;

import com.accenture.model.Person;
import com.accenture.repository.PersonRepository;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("/")
public class FirstWebService {
	
	PersonRepository repo = new PersonRepository();

	public FirstWebService() {}
	
	
	//http://localhost:8181/cxf/accenture/firstwebservice/popo
	@GET
	@Path("/firstwebservice/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public String first(@PathParam("name") String name) {
		return "This is your first web service, " + name;
	}
	
	
	//http://localhost:8181/cxf/accenture/query?from=100&to=200&orderBy=Po,Po
	@GET
	@Path("/query")
	public Response queryParam(@Context UriInfo info) {
		
		String from = info.getQueryParameters().getFirst("from");
		String to = info.getQueryParameters().getFirst("to");
		List<String> orderBy = info.getQueryParameters().get("orderBy");
		
		return Response.status(200).entity("QUERY PARAM FUNCTION from : " + from + " to: " + to + " orderBy: " + orderBy.toString()).build();
	}
	
	
	// http://localhost:8181/cxf/accenture/matrix;author=JBoss;country=Philippines
	@GET
	@Path("/matrix")
	public Response matrixParam(@MatrixParam("author") String author, @MatrixParam("country") String country) {
		return Response.status(200).entity("MATRIX PARAM FUNCTION, author: " +author + ", country: "+ country).build();
	}
	
	
	// No parameter
	@GET
	@Path("/header")
	public Response headerParam(@HeaderParam("user-agent") String userAgent) {
		return Response.status(200).entity("HEADER PARAM FUNCTION, userAgent: " +userAgent).build();
	}
	
	@GET
	@Path("/persons")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Person> getPersons(){
		return repo.getPersons();
	}
	
}
