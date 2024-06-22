package com.test1;
import java.util.*;
import java.util.Map.Entry;
public class UniqueCharInString {
public static void main(String[] args) {
		
		String str = "leetcode";
		
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> mm:map.entrySet()) {
				if(mm.getValue()==1) {
					System.out.println(mm.getKey());
					break;
				}
		}
}
}
