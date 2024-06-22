package com.test;
import java.util.*;
public class RetainAll {
public static void main(String[] args) {
		//common substring	
	String str = "adwqw";
	String str1 = "saba";
	
	Set<Character> set1 = new HashSet<>();
	Set<Character> set2 = new HashSet<>();
	
	for(int i=0; i<str.length(); i++) {
		set1.add(str.charAt(i));
	}
	for(int i=0; i<str1.length(); i++) {
		set2.add(str1.charAt(i));
	}
	
	System.out.println(set1);
	System.out.println(set2);
	
	System.out.println(set1.retainAll(set2));
	System.out.println(set1);
	
}
}
