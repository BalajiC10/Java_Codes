package com.strings;

public class MakingAnagrams {
public static void main(String[] args) {
		String str = "rate";
		String str1 = "tars";
		
		int arr[]= new int[26];
		
		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i)-96]++;
		}
		for(int i=0; i<str1.length(); i++) {
			arr[str1.charAt(i)-96]--;
		}
		int count=0;
		for(int i=0; i<arr.length; i++) {
			 count+= Math.abs(arr[i]);	
		}
		System.out.println("Elements Needs to remove: "+count);
}
}
