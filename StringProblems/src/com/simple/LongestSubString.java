package com.simple;
import java.util.*;
public class LongestSubString {
public static void main(String[] args) {
	
	String str= "abccrde";
	
	HashSet<Character> set = new HashSet<>();
	
	String longestOverall="";
	String longestTillNow="";
	
	
	for(int i=0; i<str.length(); i++) {
		char ch = str.charAt(i);
		
		if(set.contains(ch)) {
		longestTillNow="";
			set.clear();
		}
		set.add(ch);
		longestTillNow+=ch;
		
		
		if(longestTillNow.length()>longestOverall.length()) {
			longestOverall=longestTillNow;
		}
		
	}
	System.out.println(longestOverall);
}
}
