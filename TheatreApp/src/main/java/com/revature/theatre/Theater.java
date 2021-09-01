package com.revature.theatre;

import java.util.*;
import java.util.ArrayList;

public class Theater {
	private final String theatreName;
	private List<Seat> seats = new ArrayList<Seat>();

	/**
	 * ArrayList: Best for SEARCHING: takes O(1) and adding Worst for inserting
	 * elements: takes O(n) time [worst case]
	 * 
	 * Never used Arraylist when you have to do lot of insertion and deletion as
	 * this will force arraylist to adjust the elements.
	 * 
	 * ==========================================================================
	 * 
	 * LinkedList: data structure made of a chain of nodes in which each node
	 * contains a value and a pointer to the next node in the chain.
	 * 
	 * Best for: INSERTION O(1) time Worst for: SEARCHING Accessing an element also
	 * takes O(1) time, but LinkedList uses more memory than ArrayList.
	 * 
	 * Insertion and deletion of nodes are really easier. Unlike array here we don’t
	 * have to shift elements after insertion or deletion of an element. In linked
	 * list we just have to update the address present in next pointer of a node.
	 * 
	 */

	public Theater(String theatreName, int numRows, int seatsPerRow) {
		super();
		this.theatreName = theatreName;

		int lastRow = 'A' + (numRows - 1);

		for (int row = 0; row <= lastRow; row++) {

			// nested for loop for each row, to make seats for each row
			for (int seatNum = 0; seatNum <= seatsPerRow; seatNum++) {

				Seat seat = new Seat(row + String.format("%02d", seatNum));
				seats.add(seat);
			}

		}

	}

	public String getTheatreName() {
		return theatreName;
	}

	public boolean reservdSeat(String seatNumber) {

		Seat requestedSeat = null;
		for (Seat seat : seats) {
			System.out.println(".");
			if (requestedSeat.equals(seatNumber)) {
				requestedSeat = seat;
				break;

			}

		}

		if (requestedSeat == null) {
			System.out.println("there is not seat0" + seatNumber);
		}

		return requestedSeat.reserve();// we will build this particular method on the Seat class!

	}

	// Be sure to add comparable interface to Seat class...
	public boolean reserveSeatBinary(String seatNumber) {

		int low = 0;

		int high = seats.size() - 1;

		System.out.println(".");

		// select the MIDDLE num!

		int mid = (low + high) / 2;

		// Use that middle number to get the middle seat of that row

		Seat midSeatVal = seats.get(mid);

		// returns 0 if equal, returns -1 if less than, returns 1 if greater than

		int comparation = midSeatVal.getSeatNumber().compareTo(seatNumber);
		if (comparation < 0) {

			low = mid + 1;

		} else if (comparation > 0) {
			
			high = mid - 1;

		}else {
			return seats.get(mid).reserve();
		}
		
		System.out.println("there is not seat "+ seatNumber);
		return false;
			
	}

	public void getSeats() {

		for (Seat seat : seats) {
			System.out.println(seat.getSeatNumber());

		}

	}

	private class Seat implements Comparable<Seat> {

		/**
		 * Nesting classes ... is a way of logically grouping classes that are only used
		 * in one place: If a class is useful to only one other class, then it is
		 * logical to embed it in that class and keep the two together. Nesting such
		 * "helper classes" makes their package more streamlined.
		 * 
		 * It increases encapsulation: Consider two top-level classes, A and B, where B
		 * needs access to members of A that would otherwise be declared private. By
		 * hiding class B within class A, A's members can be declared private and B can
		 * access them. In addition, B itself can be hidden from the outside world.
		 * 
		 * It can lead to more readable and maintainable code: Nesting small classes
		 * within top-level classes places the code closer to where it is used.
		 */

		private final String seatNumber;// A11-G11

		private boolean reserved = false;

		public Seat(String seatNumber) {

			this.seatNumber = seatNumber;

		}

		public String getSeatNumber() {
			return seatNumber;
		}

		public boolean reserve() {
			if (!this.reserved) {

				this.reserved = true;
				System.out.println("Reservation of seat" + seatNumber + "reserved");
				return true;
			} else {
				return false;

			}

		}

		// This is how we define if a seat is greater than or less than another
		public int compareTo(Seat seat) {
			// We're using the seatNumber field as what we use to classify a greater or
			// lesser seat
			return this.seatNumber.compareToIgnoreCase(getSeatNumber());
		}
	}

//BRUTE FORCE ALGORITHM - I will check every single seat to check if it's the
	// one that I want to reserve --> This is O(n) time.

}