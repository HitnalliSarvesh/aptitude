package com.xworkz.aptitude.things;

public class Burger {
	public static void main(String[] args) {
		String type="Veg";
		System.out.println(type);
		String type1 = type.concat(" and Non-veg");
		System.out.println(type1);
		
	for(int i=0;i<type1.length();i++) {
		if(type1.charAt(i)=='e'||type1.charAt(i)=='i') {
			System.out.println(type1.charAt(i));
		}
			
	}
	
		
	}

}
