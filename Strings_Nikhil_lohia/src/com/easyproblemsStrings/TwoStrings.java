package com.easyproblemsStrings;
import java.util.*; 
public class TwoStrings {
public static void main(String[] args) {
	
	String str = "trapper";
	String str1= "barbell";
	
	Set<Character> set1 = new HashSet<>();
	Set<Character> set2 = new HashSet<>();
	
	for(char ch:str.toCharArray()) {
		set1.add(ch);
	}
	for(char ch1:str1.toCharArray()) {
		set2.add(ch1);
	}
	
	set1.retainAll(set2);
	System.out.println(set1);
	
	
	if(!set1.isEmpty()){
		System.out.println("Yes");
	}
	else{
		System.out.println("No");
	}
	System.out.println(set1.size());
	
   }
}
