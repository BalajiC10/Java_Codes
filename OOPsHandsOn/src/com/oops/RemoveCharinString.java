package com.oops;

import java.util.Arrays;
import java.util.*;
public class RemoveCharinString {
public static void main(String[] args) {
	
	String str = "ab*cd";
	
	String [] s1 = str.split(" ");
	StringBuilder sb = new StringBuilder(str);
	sb.delete(2, 3)	;
	System.out.println(sb);
	
	ArrayList<String> al = new ArrayList<>(Arrays.asList(s1));
	
	int temp=0;
	for(int i=0; i<=al.size(); i++){
		if(al.contains("*")) {
			temp=i;
			al.remove(Integer.valueOf(temp));
		}
	}
	System.out.println(temp);
	
}}
