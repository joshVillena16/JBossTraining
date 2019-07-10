package com.accenture.calculator;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class CalculatorService {

	@GET
	@Path("/add/{num1}/{num2}")
	@Produces(MediaType.APPLICATION_JSON)
	public double add(@PathParam("num1") double num1, @PathParam("num2") double num2) {
		return num1+num2;
	}
	
	@GET
	@Path("/subtract/{num1}/{num2}")
	@Produces(MediaType.APPLICATION_JSON)
	public double subtract(@PathParam("num1") double num1, @PathParam("num2") double num2) {
		return num1-num2;
	}
	
	@GET
	@Path("/multiply/{num1}/{num2}")
	@Produces(MediaType.APPLICATION_JSON)
	public double multiply(@PathParam("num1") double num1, @PathParam("num2") double num2) {
		return num1*num2;
	}
	
	@GET
	@Path("/divide/{num1}/{num2}")
	@Produces(MediaType.APPLICATION_JSON)
	public double divide(@PathParam("num1") double num1, @PathParam("num2") double num2) {
		return num1/num2;
	}
}
