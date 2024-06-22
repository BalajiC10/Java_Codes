package com.letsee;
import java.util.*;
public class RetainAll {
public static void main(String[] args) {
	char input1[]= {'A','B','C'};
	char input2[] = {'B','C'};
	
	Set<Character> set1 = new HashSet<>();
    Set<Character> set2 = new HashSet<>();

    for(int i=0; i<input1.length; i++){
        set1.add(input1[i]);
    }
    
    for(int i=0; i<input2.length; i++){
        set2.add(input2[i]);
    }
    
     set1.retainAll(set2);
     System.out.println(set1);
     
     StringBuilder sb = new StringBuilder();
     for(Character c :set1) {
    	 sb.append(c);
     }
     
     String str = sb.toString().toLowerCase();
     int sum=0;
     
     for(int i=0; i<str.length(); i++) {
    	 sum+=str.charAt(i);
     }
     
  //  System.out.println(str);
     System.out.println(sum);
		
}
}
