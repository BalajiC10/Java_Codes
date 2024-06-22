package com.letsee;
import java.util.*;
import java.util.Map.Entry;
public class Demo2 {
public static void main(String[] args) {
	
		String str = "Hi Welcome to the world";//hi to the world welcome
		
		String sb []= str.split(" ");
		int n=5;
		
		Arrays.sort(sb,Comparator.comparing(String :: length));
		
		for(int i=0; i<sb.length; i++) {
			System.out.println(sb[i]);
		}
		 
		}
}
