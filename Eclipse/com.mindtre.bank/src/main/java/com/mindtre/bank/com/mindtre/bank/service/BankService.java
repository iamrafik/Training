package com.mindtre.bank.com.mindtre.bank.service;

import java.util.List;

import com.mindtre.bank.com.mindtre.bank.models.Bank;

public interface BankService {

	public Bank createAccount(Bank bank);
	public Bank getAccountDetails(long accountNumber);
	public List getAllAccountDetails();
	
}