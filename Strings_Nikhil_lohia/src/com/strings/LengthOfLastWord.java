package com.strings;
import java.util.*;
public class LengthOfLastWord {
public static void main(String[] args) {
	int str = get(" fly me to the  moon ");
	System.out.println(str);
	
}
private static int get(String str) {
	// Auto-generated method stub
	
	int count=0;
	for(int i=str.length()-1; i>=0; i--) {
		
		if(str.charAt(i)!=' ') {
			count++;
		}
		else {
			
			if(count>0) {
				return count;
			}
		}
		
	}
	
	return count;
}
}

