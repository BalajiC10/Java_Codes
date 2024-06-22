package com.srotingarray;

public class StringBubbbleSorting {
public static void main(String[] args) {
	
	String str[] = {"Sam" ,"Joe", "Vasu","Balaji", "Rushi","Axar","Zaid" };
	String temp="";
	for(int i=0 ; i<str.length; i++ ) {
		int flag=0;
		for(int j=0; j<str.length-i-1; j++) {
			
			if(str[i].compareTo(str[j+1])>0) {
				temp=str[i];
				str[i]=str[j+1];
				str[j+1]=temp;
				flag=1;
			}
		}
		if(flag==0) {
			break;
		}
	}
	for(int k=0; k<str.length; k++) {
		System.out.print(str[k]+" ");
	}
	
}
}
