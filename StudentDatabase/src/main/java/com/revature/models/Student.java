package com.revature.models;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	private static int globalId=1000;
	 static Scanner scan=new Scanner(System.in);
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private List<Course> course=new ArrayList<>(); 
	private  double tuitionBalance=0;

	
	public Student(String firstName, String lastName, int gradeYear) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gradeYear = gradeYear;
		
		setStudenId();
		System.out.println();
	}


	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", gradeYear=" + gradeYear + ", myCourse="
				+ course + ", tuitionBalance=" + tuitionBalance + "]";
	}
	
	
	
	// setStudentId()
	
	private void setStudenId() {
		globalId++;
		this.studentId=gradeYear+" "+ globalId;
		
		
	}
		// enroll()
		public void enroll() {
			
			
			
		List<Course> myCourses=new ArrayList<Course>();
			boolean isDone=false;
			
			while (!isDone) {
				System.out.println("enter the course you want to enroll");
				String theCourse=scan.next();
				if (!theCourse.equalsIgnoreCase("q")) {
					
					Course myCourse=new Course(theCourse);
					myCourses.add(myCourse);
					tuitionBalance+= Course.costOfcourse;
					scan.nextLine();
				}else {
					System.out.println("===== done adding courses===");
					isDone=true;
				}
			}
			
			
		course=	myCourses;
		System.out.println("Enrolled in "+ course.toString());
			
		}
		// viewBalance()
		public void viewBalance() {
			
			System.out.println(" your balance is "+ tuitionBalance);
		}
		
		
		// payTuition()
		public void payTuition() {
			
		viewBalance();
		System.out.println("Enter your payment amount" );
		double payment=scan.nextDouble();
		tuitionBalance-=payment;
		System.out.println("Thanks you for your payment of "+ payment +" your remaining balance is "+ tuitionBalance);
		}
		// showStatus() 	
		public void showStatus() {
			
			System.out.println("\nName: " + firstName + " " + lastName + "\nStudent ID: " + studentId
					
					+ "\nCourses enrolled in: " + course.toString() + "\nTuition: " + tuitionBalance);
			
		}
		
		
		


		public String getStudentId() {
			return studentId;
		}


		public void setStudentId(String studentId) {
			this.studentId = studentId;
		}
}
