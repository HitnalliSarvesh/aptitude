package com.xworkz.aptitude.things;

public class SameWord {
	public static void main(String[] args) {
		String word = "Defenceless";
		char[] ch = word.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			for(int j= i+1; j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println("Dup chars are:"+ch[j]);
					break;
				}
			}
		}
	}

}
