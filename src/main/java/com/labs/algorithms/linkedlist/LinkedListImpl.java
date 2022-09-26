package com.labs.algorithms.linkedlist;

public class LinkedListImpl implements LinkedList{

	private int size;
	private Node head;
	private Node current;

	private class Node{ 
		int value;
		Node next;
		
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
	}


	@Override
	public void add(int value) {
		
		synchronized(this) {
			Node node = new Node();
			if(head == null) {
				head = node;
			}
			if(current != null) {
				current.setNext(node);
			}
			
			current = node;
			node.setValue(value);
			
			size++;
		}
	}

	@Override
	public int getHeadValue() {
		// TODO Auto-generated method stub
		return head.getValue();
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size==0;
	}

	@Override
	public int getNext() {
		return this.getNext();
	}

	@Override
	public boolean isLast() {
		// TODO Auto-generated method stub
		return current.getNext()==null;
	}

	@Override
	public void print() {
		Node temp = head;
		
		while(temp != null) {
			System.out.println(temp.value);
			temp = temp.getNext();
		}
	}

	@Override
	public boolean contains(int value) {
		
		Node temp = head;
		
		while(temp != null) {
			if(temp.value == value) return true;
			temp = temp.getNext();
		}
		return false;		
	}

	@Override
	public int getByIndex(int index) {
		
		if(index >= size) {
			return Integer.MIN_VALUE;
		}
		Node temp = head;
		
		for(int i=0; i<index; i++) {
			temp = temp.getNext();
		}
		return temp.getValue();
		
	}
	
}
