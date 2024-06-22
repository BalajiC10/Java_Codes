package com.demo.map;
import java.util.*;
import java.util.Map.Entry;
public class Demo1 {
public static void main(String[] args) {
	
	ArrayList al = new ArrayList();
	al.add(100);
 	System.out.println(al);
 	
	Map<Integer ,String> map = new HashMap<>();
	map.put(101, "Balaji");
	map.put(102, "Devansh");
	map.put(103, "Sairam");
		
	System.out.println(map.size());
	System.out.println(map.get(102));
	
	System.out.println(map);
	System.out.println("using entry: ");
	for(Entry<Integer, String> en :map.entrySet()) {
		System.out.println(en.getKey()+"-->"+en.getValue());
	}
	
	
   }
}
