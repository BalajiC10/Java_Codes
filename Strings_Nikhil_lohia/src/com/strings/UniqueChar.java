package com.strings;
import java.util.*;
import java.util.Map.Entry;
public class UniqueChar {
public static void main(String[] args) {
	
		String str = "madam";
		String res="";
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
		
		int num=0;
		for(int i=0; i<str.length(); i++) {
			if(map.get(str.charAt(i))==1) {
				num=i;
				break;
			}
		}
		System.out.println(num);

}
}
