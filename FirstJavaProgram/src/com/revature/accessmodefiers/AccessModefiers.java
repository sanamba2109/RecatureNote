package com.revature.accessmodefiers;

import java.util.Scanner;

public class AccessModefiers {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size = 5;
		int[] num = { 2, 5, 14, 4 };
		System.out.println(getAverage(num));
		int[] returnedArr = getIntegers(size);

		// you have to create the getAverage method
		double avg = getAverage(returnedArr);

		System.out.println(avg);

	}

	static double getAverage(int[] k) {
		double sum = 0;

		for (int i = 0; i < k.length; i++) {

			sum += k[i];

		}

		return sum / k.length;

	}

	static int[] getIntegers(int capacity) {

		System.out.println("Enter " + capacity + " integers");

		int[] values = new int[capacity];

		for (int i = 0; i < values.length; i++) {

			values[i] = scan.nextInt();
		}

		return values;
	}
}
