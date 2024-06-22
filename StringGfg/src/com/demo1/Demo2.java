package com.demo1;

public class Demo2 {
	public static void main(String[] args) {

		String str = "Fever filer fixer fiber fibre tailor offer";
		String str1 = "fi_er";
		str = str.toUpperCase();
		str1 = str1.toUpperCase();
		String st[] = str.split(" ");
		int index = str.indexOf('_');
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < st.length; i++) {

			if (st.length >= str1.length() && str1.replace('_', str.charAt(index)).equals(st[i].charAt(i))) {
				sb.append(st[i]).append(":");
			} else {
				sb.append("Error");
			}

		}
		System.out.println(sb);
	}
}
