package com.techmodules.list;

import java.util.ArrayList;

public class ArrayListDemo1<E> extends ArrayList<E> {
	@Override
public boolean add(E e) {
	if(e instanceof Integer || e instanceof Float || e instanceof Double ) {
		super.add(e);
		return true;
	}
	else {
		throw new ClassCastException("Only Integer, Float and Double  are Supported");
	}
}
}
