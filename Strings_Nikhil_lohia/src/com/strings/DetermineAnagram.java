package com.strings;

public class DetermineAnagram {
public static void main(String[] args) {
	
		String str = "dirtyroom";
		String str1 = "dormitory";
		
		int arr[]= new int[26];
		
		for(int i=0; i<str.length(); i++) {
			arr[(int)str.charAt(i)-96]++;
		}
		for(int i=0; i<str1.length(); i++) {
			arr[(int)str1.charAt(i)-96]--;
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				System.out.println("Anagram");
				break;
			}
			
			else {
				System.out.println("Not Anagram");
				break;
			}
		}
		
}
}
