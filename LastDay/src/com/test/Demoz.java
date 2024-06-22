package com.test;
import java.util.*;
public class Demoz {
public static void main(String[] args) {
		
	char ch[]= {'A', 'B'};
	ArrayList<String> list = new ArrayList<>();
	list.add("Ram");
	list.add("Seeta");
	
	System.out.println(list.toArray(new String[0]));	
	
}
}
