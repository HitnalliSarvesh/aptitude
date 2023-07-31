package com.xworkz.aptitude.runner;

import com.xworkz.aptitude.things.Operations;

public class OperationsRunner {
	public static void main(String[] args) {
		Operations op = new Operations();
		int result=op.calculation("+", 9, 5);
		System.out.println(result);
		int result1=op.calculation("-", 10, 5);
		System.out.println(result1);
		int result3=op.calculation("*", 4, 5);
		System.out.println(result3);
		int result4=op.calculation("/", 25, 5);
		System.out.println(result4);
	
	}

}
