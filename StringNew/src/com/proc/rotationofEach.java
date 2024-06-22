package com.proc;

public class rotationofEach {
public static void main(String[] args) {
	String str = "abcd";
	String temp = str+str;
	String check = "badc";
	if(temp.contains(check)) {
		System.out.println("it is rotated strings");
	}
	else {
		System.out.println("not rotated");
	}
		
}
}
