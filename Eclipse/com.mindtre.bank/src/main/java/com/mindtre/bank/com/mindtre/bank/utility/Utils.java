package com.mindtre.bank.com.mindtre.bank.utility;

import java.util.Random;

public class Utils {

	public static long generateRandomAccountNumber() {

		Random r = new Random();
		long randNumber = (long) (r.nextDouble()* 1000000L);
		
		return randNumber;
	}
}
