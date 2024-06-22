package com.oops;

public class StringShortLongShort {
public static void main(String[] args) {
	
	String s1 = "hi"; //2
	String s2 = "hello";   //5
	String res="";
	//hihellohi
	int len1 = s1.length(); //2
	int len2 = s2.length(); //5
	
	if(len1>len2) {//252   2<5
		System.out.println(res=s2+s1+s2);
	}
	else { // 2>5  
		System.out.println(res=s1+s2+s1);
	}
	
}
}
