package com.accenture.vacationDatesInBetween;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


public class CompareDates {
	
	BalanceCheckerService checkerService = new BalanceCheckerService();
	
	
	@GET
	@Path("/compareDates/{date1}/{date2}")
	public boolean checkRemainingBalance(@PathParam("date1") String date1, @PathParam("date2") String date2) throws ParseException{
		
		SimpleDateFormat formatter=new SimpleDateFormat("dd-MMM-yyyy"); 
		
		Date fromDate = formatter.parse(date1);
		Date toDate = formatter.parse(date2);
		
		long diff = toDate.getTime() - fromDate.getTime();
		
		return checkerService.CheckBalance(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
	}
}
