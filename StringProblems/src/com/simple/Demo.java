package com.simple;
import java.util.*;
public class Demo {
public static void main(String[] args) {
	
	String st= "peter picked piper and peter was happy to have piper";
	String str []= st.split(" ");
	Set<String>  set= new HashSet<>();
	
	for(int i=0; i<str.length; i++) {
		set.add(str[i]);
	}
	
	Iterator<String> itr = set.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next()+" ");
	}
	
}
}
