package com.basics;

public class CountVowels {
public static void main(String[] args) {
	
	String str = "My name is Balaji oh";
	int count=0;
	int countspace=0;
	int wordcount=1;
	
	for(int i=0; i<str.length(); i++) {
		char ch= str.charAt(i);
		
		if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' ) {
			count++;
		}
		else if(ch==' ') {
			countspace++;
		}
		else if(ch==' ' && str.charAt(0)!=' ') {
			wordcount++;
		}
		
	}
	
	System.out.println(count);
	System.out.println(countspace);
	System.out.println(wordcount);
}
}
