package com.easyproblemsStrings;

public class MakingAnagrams {
public static void main(String[] args) {
	
		String str = "rate";
		String str1 = "tyrs";
		
		int arr[]= new int[26];
		for(int i=0; i<str.length();i++ ) {
			arr[(int)str.charAt(i)-96]++;
		}
		for(int i=0; i<str1.length(); i++) {
			
			arr[(int)str1.charAt(i)-96]--;
		}
		int count=0;
		for(int ff:arr) {
			count+=Math.abs(ff);
		}
		
		System.out.println(count);
      }
}
