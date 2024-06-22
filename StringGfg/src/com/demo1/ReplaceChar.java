package com.demo1;

public class ReplaceChar {
	public static void main(String[] args) {

		String str = "I am Tada";
		char ch[] = str.toCharArray();
		char replaceChar = 'O';

		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == 'T') {
				ch[i] = 'V';
			}
		}
		System.out.println(ch);
	}
}
