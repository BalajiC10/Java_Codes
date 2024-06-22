package com.demo1;

public class ReverseWords {
	public static void main(String[] args) {

		String str = "Ram Seeta";

		String temp = "";
		String fin = "";

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != ' ') {
				temp = temp + str.charAt(i);

			} else {
				fin = temp + fin + " ";
				temp = "";
			}

		}
		fin = temp + fin;
		System.out.println(fin);
	}
}
