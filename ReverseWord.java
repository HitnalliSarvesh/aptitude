package com.xworkz.aptitude.runner;

public class ReverseWord {
	public static void main(String[] args) {
		/*String name= "This is sleeping time. It's not good to sleeping";
		String[] wordList = name.split(" ");
		
		String reverseWord="";
		
		for(int i=0; i<wordList.length; i++) {
			if(wordList[i].equals("sleeping")) {
				char[] reverse = wordList[i].toCharArray();
				for(int j=reverse.length-1; j>=0; j--) {
					//System.out.print(reverse[j]+" ");
					reverseWord=reverseWord+reverse[j];
					
					//System.out.println(reverseWord);
				}
				wordList[i]=reverseWord;
			}
			
		}
		for(int i=0;i<wordList.length;i++) {
			System.out.print(wordList[i]+" ");
		}
	}*/

		String name4 = "Hello everyone. Good to see you guys.";
		System.out.println(name4);
		System.out.println(name4.length());

		char[] name4List = name4.toCharArray();
		System.out.println(name4List.length);
		for (int i= 0; i<name4List.length; i++) {
			System.out.print(name4List[i]+"  ");

		}

		System.out.println();
		System.out.println(name4.split(" ").length);
		System.out.println(name4.split("y").length);
		System.out.println("----------------------------");

		String[] word1 = name4.split(" ");
		for(int i=0; i<word1.length; i++) {
			System.out.println(word1[i]);
		}
		System.out.println("----------------------------");

		String[] word2 = name4.split("e");
		for(int i=0; i<word2.length; i++) {
			System.out.println(word2[i]);
		}
		System.out.println("----------------------------");

		String[] word3 = name4.split(" ");
		for(int i=0; i<word3.length; i++) {
			if (word3[i].equals("Good")) {
				System.out.println(word3[i]);
			}else {
				System.out.println("no");
			}
		}
		System.out.println("----------------------------");

		char[] reverse = name4.toCharArray();
		for(int i = reverse.length-1; i>=0;i--) {
			System.out.print(reverse[i]+" ");
		}
		System.out.println();
		System.out.println("----------------------------");

		System.out.println("");

		//name4.replaceAll("good", "bad");

	}
}
