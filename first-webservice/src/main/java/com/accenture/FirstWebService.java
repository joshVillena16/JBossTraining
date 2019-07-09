package com.accenture;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("/")
public class FirstWebService {

	public FirstWebService() {}
	
	@GET
	@Path("/firstwebservice/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public String first(@PathParam("name") String name) {
		return "This is your first web service, " + name;
	}
	
	@GET
	@Path("/query")
	public Response firstQuery(@Context UriInfo info) {
		
		String from = info.getQueryParameters().getFirst("from");
		String to = info.getQueryParameters().getFirst("to");
		List<String> orderBy = info.getQueryParameters().get("orderBy");
		
		return Response.status(200).entity("QUERY PARAM FUNCTION from : " + from + " to: " + to + " orderBy: " + orderBy.toString()).build();
	}
	
}
