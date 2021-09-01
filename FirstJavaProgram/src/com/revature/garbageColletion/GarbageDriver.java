package com.revature.garbageColletion;



public class GarbageDriver {
	
	public static void main(String [] args) {
		
	System.out.println("instanciatin gabbage driver object");	
		
		GarbageDriver gb=new GarbageDriver();
		// currently the gb variable exist en the stack
		System.out.println(" Garbage driver object is succelfully created");
	
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			System.out.println("finally block is running");
		}
		gb=null;
		System.gc();
		for (;;) {
			System.out.println("....");
		}
	}
	//  interview question what is the diference between  final,finally and finalize
 @Override
 protected void finalize() {
	 System.out.println(" finalize methos has been created");
	 System.out.println("--------------------------");
	 System.out.println("*************************");
	 System.out.println("*************************");
	 System.out.println("*************************");
	 System.out.println("Goodbye"); 
	 System.exit(0);
 }
}
