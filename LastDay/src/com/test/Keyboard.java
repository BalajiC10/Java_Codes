package com.test;
import java.util.*;
public class Keyboard {
public static void main(String[] args) {
		
		ArrayList<Character> list1 = new ArrayList<>();
		list1.add('Q');
		list1.add('W');
		list1.add('E');
		list1.add('R');
		list1.add('T');
		list1.add('Y');
		list1.add('U');
		list1.add('I');
		list1.add('O');
		list1.add('P');
		list1.add('[');
		list1.add(']');
		list1.add('|');
		
		list1.add('A'); //13
		list1.add('S');
		list1.add('D');	//15
		list1.add('F');		
		list1.add('G');
		list1.add('H');
		list1.add('J');
		list1.add('K');
		list1.add('L');
		list1.add(';');
		list1.add('"'); //23
		
		list1.add('Z');	//24
		list1.add('X');	//25
		list1.add('C');	//26
		list1.add('V');
		list1.add('B');
		list1.add('N');
		list1.add('M');
		list1.add(',');
		list1.add('.');
		list1.add('/'); //33
		
		
		String str = "";
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(list1.contains(ch)) {
					System.out.println("got: "+ch);
					int index = list1.indexOf(ch);
					System.out.println(index);
					if(index<2) {
						
						char res = list1.get(0);
						sb.append(res);
						System.out.println(res);
						
		}
					if(index==13) {
						char res = list1.get(13);
						sb.append(res);
						
						System.out.println(res);
						
					}
					if(index==14) {
						char res = list1.get(13);
						sb.append(res);
						System.out.println(res);
						
					}
					if(index==25) {
						char res = list1.get(24);
						sb.append(res);
						System.out.println(res);
						
					}
					if(index==24) {
						char res = list1.get(24);
						sb.append(res);
						System.out.println(res);
						
					}
					
					
					
					
					
					//if(index<)
					 if(index>2 && index<13) {
						char res = list1.get(index-2);
						sb.append(res);
						System.out.println(res);
					}
					 if(index>=15 && index<=23) {
							char res = list1.get(index-2);
							sb.append(res);
							System.out.println(res);
					}
					 if(index>=26 && index<=33) {
							char res = list1.get(index-2);
							sb.append(res);
							System.out.println(res);
					}
			}
		}
		System.out.println(str);
		System.out.println(sb);
		
		
				
		
		
}
}
