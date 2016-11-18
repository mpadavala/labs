package com.labs.observerobservable;

public class ObserverObservableDemo {

	public static void main(String[] args) {
		MyObserver observer = new MyObserver();
		MyObservable observable = new MyObservable();
		observable.addObserver(observer);
		observable.setValue(2);
	}
}
