package com.simple;
import java.util.*;

public class OccuranceChar {
public static void main(String[] args) {
	
	String str = "hello";
	
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
	
	int count=0;
	System.out.println(map);
	
	Set<Integer> set= new HashSet<Integer>(map.values());
	System.out.println(set);
	System.out.println(count);
}
}
