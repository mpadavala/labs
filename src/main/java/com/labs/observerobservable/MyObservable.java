package com.labs.observerobservable;

import java.util.Observable;

public class MyObservable extends Observable {

	private int n = 0;

	public void setValue(int n) {
		this.n = n;
		System.out.println("new Value is set to : " + n);
		System.out.println("Notifying Observers");
		setChanged();
		notifyObservers();
	}

	public int getValue() {
		return n;
	}
	
}
