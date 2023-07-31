package com.xworkz.aptitude.runner;

import com.xworkz.aptitude.things.Test;

public class TestRunner {
	public static void main(String[] args) {
		Test test = new Test();
		test.accept();
		//test.ticketBooking();
		test.booking("test@gmail.com", "test", 2);
	}

}
