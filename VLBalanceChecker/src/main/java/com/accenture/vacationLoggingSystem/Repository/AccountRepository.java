package com.accenture.vacationLoggingSystem.Repository;
import java.util.ArrayList;

import com.accenture.vacationLoggingSystem.Model.Account;

public class AccountRepository {

	Account myAccount;
	
	public AccountRepository() {
		
		myAccount = new Account();
	}
	
	public Account getAccount() {
		return myAccount;
	}
}
