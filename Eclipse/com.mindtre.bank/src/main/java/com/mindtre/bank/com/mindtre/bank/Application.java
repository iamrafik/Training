package com.mindtre.bank.com.mindtre.bank;

import java.util.List;
import java.util.Scanner;

import com.mindtre.bank.com.mindtre.bank.impl.BankImpl;
import com.mindtre.bank.com.mindtre.bank.models.Bank;
import com.mindtre.bank.com.mindtre.bank.utility.Utils;

public class Application {

	public static void main(String[] args) {

		BankImpl bankimpl = new BankImpl();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1: Create Bank Account");
			System.out.println("2: Display Account Details");
			System.out.println("3: Display All Account Details");

			System.out.println("Enter the IVR choice:");
			int ivrChoice = Integer.parseInt(sc.next());
			sc.nextLine();
			switch (ivrChoice) {
			case 1:
				long accountNumber = Utils.generateRandomAccountNumber();
				
				System.out.println("Enter your name:");
				String name = sc.nextLine();

				double openingBal = 0.0;
				
				System.out.println("Set your username:");
				String userName = sc.nextLine();

				System.out.println("Set your password:");
				String password = sc.nextLine();

				Bank bank = bankimpl.createAccount(new Bank(accountNumber, name, openingBal, userName, password));
				System.out.println(bank+"\n");
				break;

			case 2:
				System.out.println("Please Enter account number:");
				long enteredAccountNumber = sc.nextLong();
				bankimpl.getAccountDetails(enteredAccountNumber);
				break;
				
			case 3:
				List bankDetails = bankimpl.getAllAccountDetails();
				if(!bankDetails.isEmpty()) {
					System.out.println(bankDetails);
				}
				else {
					System.out.println("Sorry!! No Account Available\n");
				}
				break;

			default:
				System.out.println("Hey, You have chosen a invalid IVR option!!!");

			}
		}

	}

}
