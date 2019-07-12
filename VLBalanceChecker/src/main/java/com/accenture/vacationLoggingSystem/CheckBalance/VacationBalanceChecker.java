package com.accenture.vacationLoggingSystem.CheckBalance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.accenture.vacationLoggingSystem.Repository.AccountRepository;

public class VacationBalanceChecker {

	AccountRepository accountRepo = new AccountRepository();
	
	
	//http://localhost:8181/cxf/accenture/checkBalance/9
	
	@GET
	@Path("/checkBalance/{noOfDays}")
	public boolean checkRemainingBalance(@PathParam("noOfDays") int noOfDaysRequested) {
		
		return (accountRepo.getAccount().getNoOfVacationLeaves() < noOfDaysRequested) ? false : true;
	}
}
