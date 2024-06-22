package com.charlevelprocessing;

public class EachLetterMoveBy2 {
public static void main(String[] args) {
	
	String str = "simply";
	String res = "";
	
	for(int i=0; i<str.length(); i++) {
		char ch = str.charAt(i);
		ch = (char)(ch+2);
		if(ch>'z') {
			res+='z';
		}
		else {
		res+=ch;
		}
	}
	
	System.out.println(res);
	
}
}
