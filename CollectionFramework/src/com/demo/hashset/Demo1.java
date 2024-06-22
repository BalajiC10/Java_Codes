package com.demo.hashset;
import java.util.*;
public class Demo1 {
public static void main(String[] args) {
	
	HashSet hs = new HashSet();
	
	hs.add(10);
	hs.add("Balaji");
	hs.add(10.231);
	
	System.out.println(hs);
	
	Iterator itr = hs.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	ArrayList al = new ArrayList();
	al.addAll(hs);
	System.out.println(al);
	System.out.println(hs.size());	
	
}
}
