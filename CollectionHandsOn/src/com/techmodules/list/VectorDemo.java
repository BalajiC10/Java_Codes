package com.techmodules.list;
import java.util.*;
public class VectorDemo {
public static void main(String[] args) {
	
	Vector <Integer> v1 = new Vector<>();
	v1.add(100);
	v1.add(200);
	v1.add(300);
	v1.add(400);
	v1.add(500);
	
	System.out.println("Using Enumeration: ");
	Enumeration en = Collections.enumeration(v1);
	
	while(en.hasMoreElements()) {
		System.out.println(en.nextElement()+" ");
	}
	System.out.println("Using Iterator: ");
	
	Iterator itr = v1.listIterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next()+" ");
	}
	
	System.out.println("Using ListItrator: ");
	ListIterator itre = v1.listIterator();
	while(itre.hasNext()) {
		System.out.println(itre.next());
	}
}
}
