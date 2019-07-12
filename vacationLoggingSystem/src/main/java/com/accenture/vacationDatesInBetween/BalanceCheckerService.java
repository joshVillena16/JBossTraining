package com.accenture.vacationDatesInBetween;
import org.springframework.web.client.RestTemplate;

public class BalanceCheckerService {
	
	private String URL = "//http://localhost:8181/cxf/accenture/checkBalance/";

	public boolean CheckBalance(long noOfDaysRequested) throws NullPointerException{
		return new RestTemplate().getForObject(URL + noOfDaysRequested, boolean.class);
	}
}
