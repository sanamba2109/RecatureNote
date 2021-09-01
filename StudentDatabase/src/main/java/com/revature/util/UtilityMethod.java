package com.revature.util;

import com.revature.exception.NotAGradeException;
import com.revature.models.Student;

public class UtilityMethod {
	//this class is for our helpfull method like validating thins
	public static void validateGradeYear(int gradeYear) throws NotAGradeException{
		
		if (gradeYear<=0|| gradeYear> 4) {
			//using the custom exception that we made called NotAGradeException
			 throw new NotAGradeException("please enter a numbre betwen 1 and 4");
			
			
		}
	}
   
	
	
	public static void printStudenInfo( Student[] student) {
		
		for (Student s : student) {
			s.showStatus();
			
		}
		
		
		
		
	}
}
