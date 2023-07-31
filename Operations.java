package com.xworkz.aptitude.things;

public class Operations {
	
	public Operations() {
		System.out.println("No-argument constructor");
	}
	
	public int calculation(String operation,int num1, int num2) {
		if(operation.equals("+")) {
			return num1+num2;
		}else if (operation.equals("-")) {
			return num1-num2;
		}else if(operation.equals("*")){
			return num1*num2;
		}else if(operation.equals("/")) {
			return num1/num2;
		}else {
			System.out.println("Enter valid operator");
			return 0;
		}
	
	}
	
	

}
