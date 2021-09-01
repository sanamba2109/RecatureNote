package com.revature.controlflow;

import java.util.Scanner;

public class GradeCalcChallenge {

	public static void main(String[] args) {
		int totalAmount=0;
		int pointsRight=0;
		System.out.println("Welcome to Grading Caculator!!!");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the total amount of points on the quiz");
		totalAmount=scan.nextInt();
		
		System.out.println("Enter the amount of points right  ");
		pointsRight=scan.nextInt();
		
		//Calculationg student letter grade
		int studentLetterGrade= (int)percent(pointsRight, totalAmount);
	/*	System.out.println(totalAmount);
		System.out.println(pointsRight);
		
		System.out.println(studentLetterGrade);*/
		
		if (studentLetterGrade >=90 && studentLetterGrade<=100) {
			System.out.println("The Student's Letter grade is A "  +" That's " + studentLetterGrade+ " % ");
			
		}else if (studentLetterGrade >=80 && studentLetterGrade<=89) {
			System.out.println("The Student's Letter grade is B "  +" That's " + studentLetterGrade+ " % ");
			
		}else if (studentLetterGrade >=70 && studentLetterGrade<=79) {
			System.out.println("The Student's Letter grade is C "  +" That's " + studentLetterGrade+ " % ");
			
		}else if (studentLetterGrade >=60 && studentLetterGrade<=69) {
			System.out.println("The Student's Letter grade is D "  +" That's " + studentLetterGrade+ " % ");
			
			
		}else if (studentLetterGrade >=0 && studentLetterGrade<=59) {
			System.out.println("The Student's Letter grade is E "  +" That's " + studentLetterGrade+ " % ");
			
			
		}
	}
		public static double percent(double quantity, double total) {
			double percentage=quantity/total*100;
			return percentage;
			
			
			
		}
		
	}


