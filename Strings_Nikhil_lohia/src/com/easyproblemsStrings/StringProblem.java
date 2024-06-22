package com.easyproblemsStrings;
import java.util.*;
public class StringProblem {
public static void main(String[] args) {
		String str = "wipro";
		String str1 = "balaji";
		
		ArrayList<Character> al = new ArrayList<>();
		ArrayList<Character> al2 = new ArrayList<>();
		
		Set<Character> set1 = new HashSet<>();
		Set<Character> set2 = new HashSet<>();
		
		for(int i=0; i<str.length(); i++) {
			
			al.add(str.charAt(i));
			set1.add(str.charAt(i));
		}
		for(int i=0; i<str1.length(); i++) {
			
			al2.add(str1.charAt(i));
			set2.add(str.charAt(i));
		}
		
		
		al.removeAll(al2);
		System.out.println(al);
		al2.removeAll(al);
		System.out.println(al2);
		
		set1.retainAll(set2);
		//System.out.println(set1);
	
}
}
