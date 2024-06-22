package com.demos;

import java.util.stream.Stream;

public class DemoSTream {
public static void main(String[] args) {
			String str[]= {"Balaji", "Ram","Devansh", "Rushi","Student"};
			Stream<Object> stream = Stream.of(str);
			stream.forEach(e->System.out.println(e));
}
}
