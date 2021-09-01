package com.revature;

public class TestClass {
	
	

	public String acronym(String phrase) {

		boolean isASpace = true;

		String acronym = "";
		for (int i = 0; i < phrase.length(); i++) {

			if (phrase.charAt(i) == ' ') {
				isASpace = true;

			} else if (phrase.charAt(i) != ' ' && isASpace == true) {
				acronym += phrase.charAt(i);

				isASpace = false;

			}
		}
		return acronym.toUpperCase();
	}

	public long power(int n, int p) throws Exception {

		Long calc = (long) n;
		if (n < 0 || p < 0) {

			throw new Exception("n or p should not be negative");
		} else if (n == 0 && p == 0) {
			throw new Exception("n and p should not be zero.");
		} else {

			calc = (long) Math.pow(n, p);
		}

		return calc;
	}

}
