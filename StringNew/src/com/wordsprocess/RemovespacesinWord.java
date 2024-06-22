package com.wordsprocess;

public class RemovespacesinWord {
public static void main(String[] args) {
	
		String str = "Tada is name";
		str+=" ";
		String res="";
		int count=0;
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch!=' ') {
				res+=ch;
			}
			else {
				count++;
				res="";
			}
		}
		
		System.out.println(count);
}
}
