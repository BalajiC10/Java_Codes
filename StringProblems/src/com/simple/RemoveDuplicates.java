package com.simple;
import java.util.*;
public class RemoveDuplicates {
public static void main(String[] args) {
	
	String str = "Balaji";
	
	StringBuilder sb = new StringBuilder();
	
	Set<Character> set = new LinkedHashSet<>();
	
	for(int i=0; i<str.length(); i++) {
		set.add(str.charAt(i));
	}
	for(Character cm:set) {
		sb.append(cm);
	}
	
	System.out.println(sb.toString());
	
}
}
