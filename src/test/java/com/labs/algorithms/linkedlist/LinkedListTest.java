package com.labs.algorithms.linkedlist;

import org.junit.Test;

public class LinkedListTest {
	
	@Test 
	
	public void linkedListTest() {
		
		LinkedList linkedList = new LinkedListImpl();
		
		System.out.println("adding 1");
		linkedList.add(1);
		System.out.println("adding 2");
		linkedList.add(2);
		System.out.println("adding 30");
		linkedList.add(30);
		System.out.println("adding 4");
		linkedList.add(4);
		System.out.println("adding 2");
		linkedList.add(2);
		System.out.println("adding 1");
		linkedList.add(1);
		
		System.out.println("Printing the elements in the LinkedList");
		linkedList.print();
		System.out.println("Size of the list : " + linkedList.getSize());
		System.out.println("2 : " + linkedList.contains(2));
		System.out.println("1 : " + linkedList.contains(1));
		System.out.println("4 : " + linkedList.contains(4));
		System.out.println("22 : " + linkedList.contains(22));
		System.out.println(Integer.MIN_VALUE + " : " + linkedList.contains(Integer.MIN_VALUE));
		System.out.println(Integer.MAX_VALUE + " : " + linkedList.contains(Integer.MAX_VALUE));
		System.out.println("0 : " + linkedList.contains(0));
		
		System.out.println("adding 24");
		linkedList.add(24);
		
		System.out.println("Printing the elements in the LinkedList");
		linkedList.print();
		System.out.println("getByIndex(0) : " + linkedList.getByIndex(0));
		System.out.println("getByIndex(1) : " + linkedList.getByIndex(1));
		System.out.println("getByIndex(4) : " + linkedList.getByIndex(4));
		System.out.println("getByIndex(5) : " + linkedList.getByIndex(5));
		System.out.println("getByIndex(100) : " + linkedList.getByIndex(100));
		System.out.println("getByIndex(3) : " + linkedList.getByIndex(3));
		
	}
		

}
