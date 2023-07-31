package com.xworkz.aptitude.things;

public class FindWord {
	public static void main(String[] args) {
		String quote = "Good morning guys, how are you?";
	
		//Length of the String.
		char[] quote1 = quote.toCharArray();
		System.out.println("Length of String is:"+quote1.length);
		
		for (int i= 0; i<quote1.length; i++) {
			System.out.print(quote1[i]+"  ");
			}	
		
		//Find number of words in sentence.
		System.out.println();
		System.out.println("Number of words:"+quote.split(" ").length);
		
		//Printing morning word.
		String[] quoteList = quote.split(" ");
		for(int i=0; i<quoteList.length; i++) {
			if(quoteList[i].equals("morning")) {
				char[] word = quoteList[i].toCharArray();
				System.out.println(word);
			}
		}
		
		//Counting number of times morning appears.
		int count=0;
		for(int i=0; i<quoteList.length;i++) {
			if(quoteList[i].equals("morning")) {
				count+=1;
				System.out.println("Number of times morning word appears:"+count);
			}
		}
		
	}
}
