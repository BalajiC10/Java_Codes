package com.see;
import java.util.*;
public class Demo5 {
public static void main(String[] args) {
	String input1 = "java";
	String input2 = "program";
	
	input1=input1.toLowerCase();
	input2=input2.toLowerCase();

    ArrayList<Character> al1 = new ArrayList<>();
    ArrayList<Character> al2 = new ArrayList<>();

    for(int i=0; i<input1.length(); i++){
        al1.add(input1.charAt(i));
    }
    
    for(int i=0; i<input2.length(); i++){
        al2.add(input2.charAt(i));
    }
    
    al1.removeAll(al2);
    System.out.print(al1);
    
    String res="";
    for(int i=0; i<al1.size(); i++) {
    	res+=al1.get(i);
    }
    
    int sum=0;
    for(int i=0; i<res.length(); i++) {
    	sum+=res.charAt(i)-96;
    }
    
    System.out.println(sum);
    
    int count=0;
    
    for(int i=0; i<input1.length(); i++) {
    	for(int j=0; j<input2.length(); j++) {
    		if(input1.charAt(i)==input2.charAt(j)) {
    			count++;
    		}
    	}
    	
    }
    System.out.println(count-1);
}
}
