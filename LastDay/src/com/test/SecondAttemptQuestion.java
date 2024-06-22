package com.test;

public class SecondAttemptQuestion {
public static void main(String[] args) {
		String str = "hello world";
		
		StringBuilder sb1 = new StringBuilder(str);
		str= sb1.reverse().toString();
		
		String st[]= str.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=st.length-1; i>=0; i--)	 {
				sb.append(st[i]).append(" ");	 
		}
		//olleh dlrow 
		
		StringBuilder ans = new StringBuilder();
		for(int i=0; i<sb.length(); i++) {
			char ch = sb.charAt(i);
			
			if(i>1 && i%2==0 ) {
				if(ch>='v' && ch<='z') {
					ch = 'z';
					continue;
				}
				if(ch>='V' && ch<='Z') {
					ch = 'Z';
					continue;
				}else {
					
					ch = (char)(ch+5);
				}
			}
			ans.append(ch);	
		}
		
		System.out.println(ans);
		String res= ans.toString();
		String sh[]= res.split(" ");
		String val = "";
		
		for(int i=0; i<sh.length; i++) {
			int length = sh[i].length();
			String firstchar = sh[i].substring(0, length-2);
			String restChar = sh[i].substring(length-2, length).toUpperCase();
			 val += firstchar+restChar+" ";
		}
		
		
}
}
