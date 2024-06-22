package com.wordsprocess;
import java.util.*;
public class Anagram {
public static void main(String[] args) {
	
		String str = "code";
		String st = "code";
		
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(map.containsKey(ch)) {
				map.put(ch, (map.get(ch)+1));
			}
			else {
				map.put(ch, 1);
			}
		}
		
		Map<Character, Integer> map1 = new HashMap<>();
		
		for(int i=0; i<st.length(); i++) {
			char ch1 = st.charAt(i);
			
			if(map.containsKey(ch1)) {
				map.put(ch1, (	map.get(ch1)+1));
			}
			else {
				map.put(ch1, 1);
			}
		}
		
		if(map1.equals(map)) {
			System.out.println("it is anagram");
		}
		else {
			System.out.println("it is not ");
		}
		
		
		                    
}
}