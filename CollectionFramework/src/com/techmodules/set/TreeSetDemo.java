package com.techmodules.set;
import java.util.*;
public class TreeSetDemo {
public static void main(String[] args) {
	
	TreeSet <String > set = new TreeSet<>();
	
	set.add("Ram");
	set.add("Shubham");
	set.add("Wipro");
	set.add("Rahul");
	set.add("Vishal");
	System.out.println(set);
	System.out.println("Reverse Elements: ");
	
	NavigableSet<String>treereverse = set.descendingSet();
	
	Iterator<String> iterator = treereverse.iterator();
	
	while(iterator.hasNext()) {
		System.out.print(iterator.next()+" ");
	}	
	
	 //check the TreeSet Element By using contains method
	System.out.println("\nChecking Element: ");
	System.out.println(
			set.contains("Wipro"));//return true or false
	}
}
