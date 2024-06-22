package com.problemsolving;
import java.util.*;
public class CheckAnagram {
public static void main(String[] args) {
	String input1= "abcdiiaj";
	String input2 = "abciiaj";
	
	Map<Character, Integer> map = new HashMap<>();
	for(int i=0; i<input1.length(); i++) {
		char ch = input1.charAt(i);
		
		if(map.containsKey(ch)) {
			map.put(ch	, (map.get(ch)+1));
		}
		else {
			map.put(ch, 1);
		}
		
	}
	
	Map<Character, Integer> map1 = new HashMap<>();
	for(int i=0; i<input2.length(); i++) {
		char ch = input2.charAt(i);
		
		if(map1.containsKey(ch)) {
			map1.put(ch	, (map1.get(ch)+1));
		}
		else {
			map1.put(ch, 1);
		}
		
	}
	
	if(map.equals(map1)) {
		System.out.println("it is anagram");
	}
	else {
		System.out.println("it is not anagram");
	}
	
	
}
}
