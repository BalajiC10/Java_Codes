package com.demo.list;
import java.util.*;
public class LinkedListdemo {
public static void main(String[] args) {
	
	LinkedList li = new LinkedList();
	li.add(345);
	li.add(566);
	
	Iterator itr = li.iterator();
	
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
}
}
