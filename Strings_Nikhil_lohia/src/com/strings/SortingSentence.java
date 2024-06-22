package com.strings;
import java.util.*;
public class SortingSentence {
public static void main(String[] args) {
	
		String str = "is2 sentence4 This1 a3";
		Map<Integer,String> map = new HashMap<>();
		
		
		for(String word:str.split(" ")) {
			
			int lastindex = word.length()-1;
			int index = word.charAt(lastindex)-48;
			
			String actualword = word.substring(0,lastindex);
			
			map.put(index, actualword);
			
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<Integer, String> mp:map.entrySet()) {	
			sb.append(mp.getValue());
			sb.append(" ");	
		}
		
		System.out.println(sb.toString().trim());
		
}
}
