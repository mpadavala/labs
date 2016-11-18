package com.labs.observerobservable;

import java.util.Observable;
import java.util.Observer;

public class WeatherObserver implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherManager){
			WeatherManager observableValue = (WeatherManager)o;
			System.out.println("In WeatherObserver - Value is : " + observableValue.getTemperature());
		}
	}

}
