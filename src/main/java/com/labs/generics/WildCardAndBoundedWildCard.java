package com.labs.generics;

import java.util.ArrayList;
import java.util.Collection;

public class WildCardAndBoundedWildCard {

	public static void main(String args[]) {
		Collection<String> collection = new ArrayList<String>();
		collection.add("a");
		collection.add("b");
		collection.add("c");

		printCollection1(collection);
		printCollection2(collection);
		System.out.println("Both Methods above are the same");

	}

	public static void printCollection1(Collection<?> c) {
		for (Object e : c) {
			System.out.println(e);
		}
	}

	public static void printCollection2(Collection<? extends Object> c) {
		for (Object e : c) {
			System.out.println(e);
		}
	}
}
