package com.revature;

import com.revature.theatre.Theater;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stubthe
		Theater theatre=new Theater("MANGO", 8, 12);
		
		theatre.getSeats();
		if (theatre.reserveSeatBinary("5902")) {
			System.out.println("please pay to reverve this  free seat");
			
		}else {
			System.out.println("sorry this seat is reserved");
		}
	}

}
