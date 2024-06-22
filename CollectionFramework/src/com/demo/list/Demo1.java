package com.demo.list;
import java.util.*;
public class Demo1 {
public static void main(String[] args) {
	
	List<Integer> l1 = new ArrayList<Integer>();
	l1.add(0, 100);
	l1.add(1, 200);
	l1.add(2, 300);
	
	
	//System.out.println(l1);
	ListIterator<Integer> itre = l1.listIterator();
	while(itre.hasPrevious()) {
		System.out.println(itre.previous());
	}

	
	Iterator itr = l1.iterator();
	
	
}
}
