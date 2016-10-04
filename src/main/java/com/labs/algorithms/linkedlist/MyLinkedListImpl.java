package com.labs.algorithms.linkedlist;

public class MyLinkedListImpl implements MyLinkedList {

	private int size;
	private Node head = null;
	private Node current = null;
	
	
	public void add(int value){
		
		synchronized(this){
			Node node = new Node(value);
			size++;
			if(current != null){
				current.setNext(node);
			}
			current = node;
			
			if(head == null){
				head = node; 
			}
		}
	}
	
	public boolean contains(int value){

		Node temp = head;

		while(temp != null){
			 if(temp.getValue() == value){
				 return true;
			 }else{
				 temp = temp.getNext();
			 }
		}
		return false;
		
	}
	
	public int getByIndex(int index){
		
		if(index <0 || index>=size){
			return Integer.MIN_VALUE;
		}
		Node temp = head;
		for(int i=1; i<=index; i++){
			temp = temp.getNext();
		}
		return temp.getValue();
	}
	
	public void print(){
		Node temp = head;
		while(temp != null){
			System.out.println(temp.getValue());
			temp = temp.getNext();
		}
	}
	
	public int getHeadValue(){
		return head == null ? Integer.MIN_VALUE : head.getValue();
	}

	@Override
	public int getSize() {
		return size;
	}
	
	@Override
	public boolean isEmpty(){
		return size == 0;
	}
	
	@Override
	public int getNext() {
		
		if(current != null){
			Node next = current.getNext();
			return (next == null) ? Integer.MIN_VALUE : next.getValue();
		}
		
		return Integer.MIN_VALUE;
	}

	@Override
	public boolean isLast() {
		return current == null;
	}
	
	
	private class Node {
		
		private int value;
		private Node next;
		
		public Node(int value) {
			super();
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}
		
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
	}

}
