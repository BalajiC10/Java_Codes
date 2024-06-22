package com.strings;

public class GroupedAnagrams {
public static void main(String[] args) {
	
		String str[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
		//op = {["bat"],["nat","tan"], ["ate", "eat","tea"];
		String sf = freqString("balaji");
		System.out.println(sf);
		
		
}
	public static String freqString(String str) {
			
			int arr[]= new int[26];
			
			for(int i=0; i<str.length(); i++) {
				char ch = str.charAt(i);
				arr[str.charAt(i)-96]++;
				
	       }
			
			StringBuilder sb = new StringBuilder();
			char c= 'a';
			
			for(int i:arr) {
				sb.append(c);
				sb.append(i);
				c++;
			}
			
			return sb.toString();
			
			
		}
}
