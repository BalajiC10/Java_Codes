package com.pract;

public class Demo2 {
public static void main(String[] args) {
	String input1 = "Manoj";
	String input2 = "Kumar";
	String res="";
	
	if(input1.length()==input2.length()) {
		if(input1.compareTo(input2)<-1) {
			res=input2.charAt(input2.length()-1)+input1;
		}
		else {
			res=input1.charAt(input1.length()-1)+input2;
		}
	}
	System.out.println(res);
}
}
