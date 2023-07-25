package com.xworkz.aptitude.things;

public class Reverse {
	public static void main(String[] args) {
		String word="I drink coffee every morning.";
		String reverseWord="";
		
		String[] list = word.split(" ");
		for(int i=0; i<list.length; i++) {
			if(list[i].equals("coffee")) {
				char[] reverse = list[i].toCharArray();
				for(int j=reverse.length-1; j>=0; j--) {
					//System.out.print(reverse[j]+" ");
					reverseWord=reverseWord+reverse[j];
					
					System.out.println(reverseWord);
				}
				list[i]=reverseWord;
			}
			
		}
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
	}	
}




