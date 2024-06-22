package com.techmodules.list;

import java.util.*;

public class Demo1 {
	public static void main(String[] args) {
		
		List list= new ArrayList();
		
		try {
			list.add(30);
			list.add(1.2f);
			list.add(3.123D);
			list.add("Test");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(list);
	}
}
