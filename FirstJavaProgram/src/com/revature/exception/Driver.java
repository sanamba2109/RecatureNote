package com.revature.exception;

import java.util.Scanner;

public class Driver {
	 private static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=12;
		int y=0;
		
		 
		int resutl=divide(x, y);
		System.out.println(resutl);

	}
	
	
		static int divide(int x , int y) {
			
			try {
				int div=x/y;
				return div;
			} catch (ArithmeticException e) {
				System.out.println( e );
				System.out.println("you cannot divide by 0 ");
				
			}finally {
				System.out.println("youre here anyway ajajaja");
			}
			return 0;
		
			
			
			
		}

}
