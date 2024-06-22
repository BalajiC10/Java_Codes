package com.problemsolving;

public class EvenWordDemo {
public static void main(String[] args) {
	
	String str = "Balaji Chilverii";
	
	for(String cm:str.split(" ")) {
		if(cm.length()%2==0) {
			System.out.println(cm);
		}
	}
	
}
}
