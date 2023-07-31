package com.xworkz.aptitude.things;

public class Remove {
	public static void main(String[] args) {
		
		  String abc = "I drink coffee every morning"; 
		  String remove="";
		  char[] ch = abc.toCharArray();
		 

	//Finding number of white spaces and removing white spaces
		  int index =0;
		  for(int i=0; i<ch.length;i++) {
			  if(ch[i]!=' ') {
				  remove = remove+ch[i];
			  }else {
				  index++;
			  }
		  }
		  System.out.println(remove);
		  System.out.println("Number of white spaces:"+index);
	
	
	//Checking vowels.
		  int count=0;
		  for(int i=0;i<ch.length;i++) {
			  if(ch[i]=='a'|| ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
				  System.out.println(ch[i]);
				  count++;
			
			  }
		  }
		  System.out.println("Total vowels in the string:"+count);
	
	}
}