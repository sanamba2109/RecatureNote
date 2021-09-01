package com.revature.driver;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.revature.exception.NotAGradeException;
import com.revature.models.Student;
import com.revature.util.UtilityMethod;

public class Driver {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// ctrl + shift + o is short cut to import!

		// Step 1. prompt the user how many students to enter
		System.out.println("Enter the number of students ");

		int numberOfStudents = scan.nextInt();

		// get the capacity for an array of Student objects
		Student[] studentArray = new Student[numberOfStudents];
		// iterate over the array and for each object, we prompt the user for all object
		// details

		for (int i = 0; i < numberOfStudents; i++) {

			System.out.println("Enter student Name");
			String name = scan.next();

			System.out.println("Enter student Last Name ");
			String lastName = scan.next();

			System.out.println("Enter Student Grade year:\n - fresman\n2 -Sophomore\n3 -junio\n4 - Senior ");
			int gradeYear = 0;
			boolean isValidInput = false;
			while (!isValidInput) {
				try {
					gradeYear = scan.nextInt();
					
					UtilityMethod.validateGradeYear(gradeYear);
					
					isValidInput = true;
				} catch (NotAGradeException e) {
					System.out.println(e.getMessage());
					
				} catch (InputMismatchException ex) {
					System.out.println("Just have a " + ex + "please entrer a valid number between 1 and 4");

				} finally {
					scan.nextLine();
				}

			}
			studentArray[i] = new Student(name, lastName, gradeYear);
			studentArray[i].enroll();
			System.out.println(studentArray[i]);
			UtilityMethod.printStudenInfo(studentArray);
		}

		// Step 2. as we create those students, the user is prompted
		// to enter the properties of the student

		// TODO: build a student model and a course model
	}

}
