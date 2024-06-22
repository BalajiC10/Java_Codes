package com.techmodules.map;
import java.util.*;
public class TestCountryMap {
public static void main(String[] args) {
	
	CountryMap cp = new CountryMap();
	
	cp.saveCountryCapital("India", "Maharashtra");
	cp.saveCountryCapital("Japan"	,"tokyo");
	cp.saveCountryCapital("USA", "Washington D.C");
	
	
	System.out.println(cp.getCapital("India"));
	System.out.println(cp.getCountry("tokyo"));
	System.out.println(cp.toArrayList());
	
	HashMap<String, String > M2 = cp.swapKeyValue();
	System.out.println(M2);
}
}
