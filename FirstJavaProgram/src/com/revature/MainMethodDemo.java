package com.revature;

public class MainMethodDemo {

	
	int word=10;
	public static void main(String[] args) {
		System.out.println("testing 102 02");
		
		for (String word : args) {
			System.out.println("the comando was"+ word);
			
		}
		
		
 try {
	System.out.println("the third comand  after executing the main methos is"+ args[2]);
} catch (ArrayIndexOutOfBoundsException e) {
	// TODO Auto-generated catch block
	System.out.println("you didn 't pas enough argument");
	e.printStackTrace();
}
	}

}
