package com.geeksforgeeks;
public class SwapChar {
public static void main(String[] args) {
	
		String str = "GeeksforGeeks";
		//Blajai
		
		char ch[]=  str.toCharArray();
		for(int i=1; i<ch.length-1; i+=2) {
			
			char temp = ch[i];
			ch[i]= ch[i+1];
			ch[i+1]= temp;
			
		}
		
		System.out.println(new String(ch));
		
}
}
