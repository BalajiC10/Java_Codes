package com.simple;
import java.util.*;
public class Problem1 {
public static void main(String[] args) {
	
	String str = "Learn code with Krishna";
	int cword=1;
	int vcount=0;
	int upc=0,lowc=0;
	for(int i=0; i<str.length(); i++) {
		
			char ch = str.charAt(i);
			
			if(str.charAt(i)==' ' && str.charAt(i+1)!=0) {
				cword++;
			}
			if(ch=='a' || ch=='e' || ch=='i'  || ch=='o' || ch=='u') {
				vcount++;
			}
			
			Map<Character ,Integer> map = new HashMap<>();
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			
			else {
				map.put(ch, 1);
			}
			
			if(Character.isUpperCase(ch)) {
				upc++;
			}
			
			if(Character.isLowerCase(ch)) {
				lowc++;
			}
			
		
	}
	System.out.println("words: "+cword);
	System.out.println("vowels count: "+vcount);
	System.out.println("Uppercase count: "+upc);
	System.out.println("Lowercase count: "+lowc);
}
}
