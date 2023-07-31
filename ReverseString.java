package com.xworkz.aptitude.things;

public class ReverseString {
	public static void main(String[] args) {
		String name="SARVESH";
		
		//Find length of a string
		char[] name1=name.toCharArray();
		System.out.println("Length of String is:"+name1.length);
		
		//Reverse a String
		char[] name2=name.toCharArray();
		for(int i=name2.length-1;i>=0;i--) {
			System.out.print(name2[i]);
		}
	
	}
	
}

