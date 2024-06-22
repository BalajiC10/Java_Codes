package com.demo1;

public class TrimString {
	public static void main(String[] args) {

		String str = "  Hello My Name is Balaji  ";

		char ch[] = str.toCharArray();
		int start = 0, end = 0, count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (ch[i] != ' ') {
				start = i;
				break;
			}
		}
		for (int i = str.length() - 1; i >= 0; i--) {
			if (ch[i] != ' ') {
				end = i;
			}
		}
		count = end - start + 1;
		String st = new String(ch, start, count);
		System.out.println(st);
	}
}
