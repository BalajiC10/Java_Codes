
package com.demo.map;
import java.util.*;
public class HashMapDemo {
public static void main(String[] args) {
	
	HashMap hm = new HashMap();
	hm.put(1,'a');
	hm.put(2, 'b');
	System.out.println(hm);
	
	Set set = hm.entrySet();
	
	System.out.println(set);
	
	Iterator itr = set.iterator();
	while(itr.hasNext()) {
		Map.Entry entry = (Map.Entry) itr.next();
		System.out.println( entry.getKey()+"-> "+ entry.getValue());
	}
	
	
}
}
