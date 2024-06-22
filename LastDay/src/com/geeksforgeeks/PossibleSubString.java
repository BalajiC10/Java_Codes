package com.geeksforgeeks;

public class PossibleSubString {
public static void main(String[] args) {
		
		String str = "ABC";
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			
			for(int j=i+1; j<=str.length(); j++) {
					sb.append(str.substring(i,j))	;
				}
		}
		System.out.println(sb);
}
}
