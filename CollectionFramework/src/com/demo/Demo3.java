package com.demo;
import java.util.*;
public class Demo3 {
public static void main(String[] args) {
	
	ArrayList al = new ArrayList();
	al.add(100);//it is obj 100;
	al.add(200);
	al.add(300);
	
	
	ArrayList al2 = new ArrayList();
	al2.add(400);
	al2.add(500);
	al2.addAll(al);
	
	
	System.out.println(al2);
	System.out.println(al.contains(3000));
}
}
