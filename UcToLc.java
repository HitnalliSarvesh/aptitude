package com.xworkz.aptitude.things;

public class UcToLc {
	public static void main(String[] args) {
		String name="Hi I am sArVeSh LeArNiNg JaVa At XwOrKz";
		char[] ch = name.toCharArray();
		
		for(int i=0; i<ch.length;i++) {
			if(ch[i]>=65 && ch[i]<=90) {
				
				 ch[i] = (char) (ch[i]+32);
			}
			
		}
		for(int i = 0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}

	}
}