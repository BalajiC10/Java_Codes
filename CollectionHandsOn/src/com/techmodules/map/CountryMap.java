package com.techmodules.map;
import java.util.*;
import java.util.Map.Entry;
public class CountryMap {
	
	private HashMap<String ,String>  M1;
	
	public CountryMap() {
		M1 = new HashMap<>();
	}
	
	public HashMap<String, String> saveCountryCapital(String CountryName, String capital){
		M1.put(CountryName, capital);
		return M1;
	}
	
	public String getCapital(String CountryName) {
		return M1.get(CountryName);
		
	}
	
	public String getCountry(String CapitalName) {
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, String> me = itr.next();
			
			if(me.getValue().equals(CapitalName)) {
				return me.getKey();
			
			}
			System.out.println(itr.next());
		}
		
		return null;
		
	}
	
	public HashMap<String , String> swapKeyValue(){
		
		HashMap<String, String> M2 = new HashMap<String, String>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator <Entry<String,String> > it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			M2.put(me.getKey(), me.getKey());
		}
		
		return M2;
	}
	
	public ArrayList<String > toArrayList(){
		
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>>	set = M1.entrySet();
		Iterator <Entry<String, String>> it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			list.add(me.getKey());
		}
		
		return list;
	}
	
	
}
