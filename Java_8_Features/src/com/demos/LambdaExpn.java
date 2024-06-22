package com.demos;

import java.util.ArrayList;

public class LambdaExpn {
public static void main(String[] args) {
	
	ArrayList<Integer> al = new ArrayList();
	al.add(100);
	al.add(200);
	al.add(300);
	al.add(400);
	System.out.println("Using lamba expn");
	al.forEach((a)->System.out.println(a));
	
}
}
