package com.xworkz.aptitude.things;

public class Repeated {
	public static void main(String[] args) {
		String input="John,is,cutting,the,apple,using,the,knife,sitting,on,the,bench,with,puppy";
		String [] input1=input.split(",");
		int count =0;
		
		for(int i=0; i<input1.length;i++) {
			System.out.println("i:"+input1[i]);
			for(int j=i+1; j<input1.length; j++) {
				System.out.println("j:"+input1[j]);
				if(input1[i].equals(input1[j])) {
					count+=1;
					System.out.println("Repeated words are:"+input1[i]);
					//System.out.println(input1[i].replace("the", "and"));
					
			   }
		
			}
		}
		System.out.println(count);
	}
}

