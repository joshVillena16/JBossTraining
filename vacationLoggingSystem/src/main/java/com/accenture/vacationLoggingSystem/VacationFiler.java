package com.accenture.vacationLoggingSystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.ws.rs.POST;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.springframework.format.annotation.DateTimeFormat;

@Path("/")
public class VacationFiler {

	CompareDatesService datesService = new CompareDatesService();
	
	//http://localhost:8181/cxf/accenture/leaves?name=joshua&fromDate=09-Dec-1998&toDate=011-Dec-1998
	@GET
	@Path("/leaves")
	@Produces(MediaType.APPLICATION_JSON)
	public String fileLeave(@Context UriInfo info) throws ParseException {
		
		String name = info.getQueryParameters().getFirst("name");
		String fromDateString = info.getQueryParameters().getFirst("fromDate");
		String toDateString = info.getQueryParameters().getFirst("toDate");
		
		return (datesService.CheckBalance(fromDateString, toDateString) ? "VL Approved" : "No VL for you");
	}
}