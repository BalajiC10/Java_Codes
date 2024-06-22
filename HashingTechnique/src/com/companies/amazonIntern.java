package com.companies;
import java.util.*;
public class amazonIntern {
public static void main(String[] args) {
	String s = "monomon";
	String t = "mon";
	//how many times t contains in s return count

	
	HashMap<Character, Integer> map1 = new HashMap<>();
	HashMap<Character, Integer> map2 = new HashMap<>();
	
	for(int i=0;i <s.length(); i++) {
		char ch = s.charAt(i);
		if(map1.containsKey(ch)) {
			map1.put(ch, (map1.get(ch))+1);
		}
		else {
			map1.put(ch, 1);
		}
	}
	
	for(int i=0;i <t.length(); i++) {
		char ch = t.charAt(i);
		if(map2.containsKey(ch)) {
			map2.put(ch, (map2.get(ch))+1);
		}
		else {
			map2.put(ch, 1);
		}
	}
	
	System.out.println(map1);
	System.out.println(map2);
	
	int count=0;
	
	for(int i=0; i<t.length(); i++) {
		char c = t.charAt(i);
		
		if(!map1.containsKey(c)) {
			System.out.println(0);
		}                                                                             
                                                                  		
		int val = map1.get(c)/map2.get(c);
		count= Math.max(val, count);
		
	}
	System.out.println(count);
	
	
}
}
