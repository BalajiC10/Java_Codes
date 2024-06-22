package com.charlevelprocessing;

public class Pallidrome {
public static void main(String[] args) {
	
	String str = "aha";
	String rev="";
	for(int i=0; i<str.length(); i++) {
		char ch = str.charAt(i);
		rev=ch+rev;
	}
	
	if(rev.equals(str)) {
		System.out.println("pall");}
	
	else {
		System.out.println("Nope");
	}
}
}
