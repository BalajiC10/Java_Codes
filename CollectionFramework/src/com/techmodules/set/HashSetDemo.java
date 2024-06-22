package com.techmodules.set;
import java.util.*;
public class HashSetDemo {

	
	HashSet<String> set = new HashSet<>();
			
	public HashSet<String> addCountry(String countryName) {
		set.add(countryName);
		return set;
	}
	
	String findCountry(String countryName) {
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			if(itr.next().equals(countryName)) {
				return countryName;
			}
		}
		return "Country Not Found";
	}
	
	void printAllCountries() {
		Iterator itre = set.iterator();
		while(itre.hasNext()) {
			System.out.println( itre.next());
			}
	}
	}
	

