package com.labs.observerobservable;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof MyObservable){
			MyObservable observableValue = (MyObservable)o;
			System.out.println("In MyObserver - Value is : " + observableValue.getValue());
		}
	}

}
