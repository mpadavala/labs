package com.labs.algorithms.linkedlist;

public interface MyLinkedList {

	public void add(int value);
	
	public int getHeadValue();
		
	public int getSize();
	
	public boolean isEmpty();
	
	public int getNext();
	
	public boolean isLast();
	
	public void print();
	
	public boolean contains(int value);
	
	public int getByIndex(int index);
	
}
