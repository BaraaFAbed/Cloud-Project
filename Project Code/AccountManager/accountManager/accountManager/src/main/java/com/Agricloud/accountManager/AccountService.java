package com.Agricloud.accountManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accounts;
	
	public Account addAccount(Account account) {
		return accounts.save(account);
	}
	
	public Account getAccount(String username) {
		return accounts.getbyUName(username.toLowerCase());
	}
	
	public Account updateAccount(Account account) {
		accounts.updateAccount(account.getName(), account.getHashedPassword(), account.getEmail(), account.getUsername());
		return accounts.getbyUName(account.getUsername().toLowerCase());
	}
	
	public String deleteAccount(String username) {
		if (accounts.getbyUName(username) == null) return "Error... Null";
		
		accounts.deleteAccount(username.toLowerCase());
		return "Removed";
	}
	
}
