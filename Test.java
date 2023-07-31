package com.xworkz.aptitude.things;

public class Test {
	final String email= "test@gmail.com";
	final String password="test";
	
	int[] ticket= {1,2,3,4,5,6,7,8,9,10};
	
	public Test() {
		System.out.println("No-arg constructor");
	}
	
	
	public void accept() {
		if(email.equals(email) && password.equals(password)) {
			System.out.println("Welcome to the page");
		}else {
			System.out.println("Incorrect email and password");
		}
	}
	public void ticketBooking() {

		for(int i=0; i<ticket.length;i++) {
			if(ticket[i]<=10 && ticket[i]>0) {
				System.out.println("Available seats:"+ticket[i]);
			}
			
	}
		
}
	public void booking(String email, String password, int seatNumber) {
		int seatBooked;
		if(email.equals(email) && password.equals(password)) {
			for(int i=0; i<seatNumber; i++) {
				if(seatNumber<=10 && seatNumber==ticket[i]) {
					System.out.println("Ticket confirmed:"+seatNumber);
					seatBooked=ticket[i];
					System.out.println("Booked seat is:"+seatBooked);
					break;
					
				}else {
					System.out.println("Seat not available");
				}
			}
		   
		}
		
		
	}

}