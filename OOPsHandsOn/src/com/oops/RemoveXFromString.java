package com.oops;

public class RemoveXFromString {
public static void main(String[] args) {
	
	String str = "xAmericax";
	
	if(str.contains("x")) {
		System.out.println(str.replace("x", ""));
	}
	else {
		System.out.println(str);
	}
}
}
