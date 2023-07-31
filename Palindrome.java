package com.xworkz.aptitude.things;

public class Palindrome {
	public static void main(String[] args) {
		String name = "EYE";
		char[] ch=name.toCharArray();
		String reverse="";
		
		for(int i=ch.length-1;i>=0;i--) {
			System.out.println(ch);
			reverse+=ch[i];
		}
			
			if(name.equals(reverse)) {
				System.out.println("Palindrome");
			}else {
				System.out.println("Not a Palindrome");
			}
			
		}
	}


