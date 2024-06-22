package com.proc;
import java.util.*;
public class LongestSubstring {
public static void main(String[] args) {
	
	String str = "abcdad";
	String longestTillNow="";
	String longestOverall="";
	
	Set<Character> set = new HashSet<>();
	
	for(int i=0; i<str.length();i++) {
		char ch =str.charAt(i);
		
		if(set.contains(ch)) {
			longestTillNow="";
			set.clear();
		}
		
		set.add(ch);
		longestTillNow+=ch;
		if(longestOverall.length()<longestTillNow.length()) {
			longestOverall=longestTillNow;
		}
	}
	System.out.println(longestOverall);
}
}
