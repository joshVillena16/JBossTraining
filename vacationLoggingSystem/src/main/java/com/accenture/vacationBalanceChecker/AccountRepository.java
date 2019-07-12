package com.accenture.vacationBalanceChecker;

public class AccountRepository {

	Account myAccount;
	
	public AccountRepository() {
		
		myAccount = new Account();
	}
	
	public Account getAccount() {
		return myAccount;
	}
}