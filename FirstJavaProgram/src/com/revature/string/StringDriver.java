package com.revature.string;

public class StringDriver {

	public static void main(String[] args) {
		
		String stringObject= new String(" go to the heap");
		System.out.println(stringObject);
		String stringLiteral=" go to the string pool";
		System.out.println(stringLiteral);
		
		
		String str1="hello";
		String str2="hello";
		System.out.println(" does the str1 have the same value than str2"+ " "+str1.equals(str2));
		System.out.println(" do they have the same location"+ (str1==str2));
		// TODO Auto-generated method stub

	}

}
