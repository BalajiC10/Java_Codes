package com.problemsolving;
import java.util.*;
public class UncommonCharUsingCollection {
public static void main(String[] args) {
	
	char input1[]= {'j','a','v','a'};
	char input2[]= {'p','r','o','g','r','a','m'};
	
	ArrayList<Character> al = new ArrayList<>();
	for(int i=0; i<input1.length; i++) {
		
		al.add(input1[i]);
	}
	ArrayList<Character> al2 = new ArrayList<>();
	for(int i=0; i<input2.length; i++) {
		
		al2.add(input2[i]);
	}
	al.removeAll(al2);
	System.out.println(al);
	
	char input3[]= {'w','i','p','r','o'};
	char input4[]= {'l','i','m','i','t','e','d'};
	
	ArrayList<Character> al3 = new ArrayList<>();
	for(int i=0; i<input3.length; i++) {
		
		al3.add(input3[i]);
	}
	
	ArrayList<Character> al4 = new ArrayList<>();
	for(int i=0; i<input4.length; i++) {
		
		al4	.add(input2[i]);
	}
	al4.removeAll(al3);
	System.out.println(al4);

	
}
}
