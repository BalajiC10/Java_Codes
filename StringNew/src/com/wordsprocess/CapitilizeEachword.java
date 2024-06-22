package com.wordsprocess;

public class CapitilizeEachword {
	public static void main(String[] args) {
		
		String str = "my name is balaji";
		str+="";

		String res="";
		String ns="";
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch!=' ') {
				res+=ch;	
			}
			else {
				char f = res.charAt(0);
				System.out.println(f);
				f=Character.toUpperCase(f);
				ns=ns+f+res.substring(1)+" ";
				res="";
			}
		}
		System.out.println(ns);
	}
}
