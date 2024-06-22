package com.simple;

public class RemoveSpace {
public static void main(String[] args) {
	
	String name= "Ba la ji";
	String str = name.replaceAll("\\s", "");
	System.out.println(str);
	
	}
}
