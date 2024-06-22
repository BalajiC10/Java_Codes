
package com.demo.vecor;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemoEnum {
public static void main(String[] args) {
	
	Vector v = new Vector();
	
	v.add(10);
	v.add("Data");
	v.add(200);
	
	Enumeration en = v.elements();
	while(en.hasMoreElements()) {
		System.out.println(en.nextElement());
	}
}
}
