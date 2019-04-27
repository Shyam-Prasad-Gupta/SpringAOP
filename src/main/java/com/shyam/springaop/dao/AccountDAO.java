package com.shyam.springaop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public void addAccount() {
		System.out.println("Added the new user account into the DB." + getClass());
	}

	public boolean deleteAccount(int acctId) {

		System.out.println("Account with id: " + acctId + " is successfully deleted.");
		return true;
	}

}
