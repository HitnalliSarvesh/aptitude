package com.xworkz.aptitude.things;

public class LengthStr {
	public static void main(String[] args) {
		
		String name="Good morning everyone, have a good day.";
		System.out.println(name);
		System.out.println("Length using method:"+name.length());
		
		//Find length of String by using for loop and charArray()
		char[] nameList = name.toCharArray();
		System.out.println("Length using charArray[]:"+nameList.length);
		for (int i= 0; i<nameList.length; i++) {
			System.out.print(nameList[i]+"  ");
		}
		
		//Finding number of words.
		System.out.println();
		System.out.println("Number of words:"+name.split(" ").length);
		
		//converting char[] to string.
		String[] word1 = name.split(" ");
		for(int i=0; i<word1.length; i++) {
			System.out.print(word1[i]+" ");
		}
		
		//Reversing the sentence
		System.out.println();
		char[] reverse = name.toCharArray();
		for(int j=reverse.length-1; j>=0; j--) {
			System.out.print(reverse[j]+" ");
		}	
	}
}
