package com.problemsolving;

public class PrintVowels {
public static void main(String[] args) {
	String str = "Welcome to the java world";
	int vowelCount=0;
	int wordCount=1;
	int upperCaseCount=0;
	int lowerCaseCount=0;
	
	for(int i=0; i<str.length(); i++) {
		char ch = str.charAt(i);
		
		switch(ch) {
		case 'a' : vowelCount++;
		case 'e' : vowelCount++;
		case 'i' : vowelCount++;
		case 'o' : vowelCount++;
		case 'u' : vowelCount++;
		
		case 'A' : vowelCount++;
		case 'E' : vowelCount++;
		case 'I' : vowelCount++;
		case 'O' : vowelCount++;
		case 'U' : vowelCount++;
		
		
		}
		if(ch==' ' && ch!=' ') {
			
			wordCount++;
		}
		else if (ch>=65 && ch<=90) {
			upperCaseCount++;
		}
		else if(ch>=97 && ch<=122)
			lowerCaseCount++;
		
	}
	System.out.println(vowelCount);
	System.out.println(wordCount);
	System.out.println(upperCaseCount);
	System.out.println(lowerCaseCount);
}
}
