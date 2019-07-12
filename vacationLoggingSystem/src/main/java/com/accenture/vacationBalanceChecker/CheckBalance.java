package com.accenture.vacationBalanceChecker;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


public class CheckBalance {

	AccountRepository repo = new AccountRepository();
	
	//http://localhost:8181/cxf/accenture/checkBalance/9
	@GET
	@Path("/checkBalance/{noOfDays}")
	public boolean checkRemainingBalance(@PathParam("noOfDays") long noOfDaysRequested) {
		
		return (repo.getAccount().getNoOfVacationLeaves() < noOfDaysRequested) ? false : true;
	}
}
