package com.simple;

public class ReplaceCharFirstToLast {
public static void main(String[] args) {
	
			String str = "my name is ram";
			String st[]= str.split(" ");
			String ee="";
			
			StringBuilder sb = new StringBuilder();
			
			for(int i=0; i<st.length; i++) {
				char f = st[i].charAt(0);
				int len = st[i].length();
				char l = st[i].charAt(len-1);
				sb.append(l);
				sb.append(f);
				sb.append(" ");
			}
			
			System.out.println(sb);
    }
}
