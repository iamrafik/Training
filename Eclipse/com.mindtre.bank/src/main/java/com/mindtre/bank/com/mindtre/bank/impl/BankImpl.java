package com.mindtre.bank.com.mindtre.bank.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.mindtre.bank.com.mindtre.bank.models.Bank;
import com.mindtre.bank.com.mindtre.bank.service.BankService;

public class BankImpl implements BankService {

	static HashMap<Integer, Bank> bankMap = new HashMap<Integer, Bank>();
	// ArrayList<Bank> bankArr = new ArrayList<Bank>();

	public Bank createAccount(Bank bank) {
		bank.setId(getMaxId());
		bankMap.put(bank.getId(), bank);
		return bank;
	}

	public Bank getAccountDetails(long accountNumber) {

		return null;

	}

	public List getAllAccountDetails() {
		
		List accountList = new ArrayList(bankMap.values());
		return accountList;
		
	}

	//
	public static int getMaxId() {
		int max = 0;
		
			for (int id : bankMap.keySet()) {
				if (max <= id) {
					max = id;
				}
			}
			return max + 1;
		
	}

}
