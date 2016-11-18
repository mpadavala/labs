package com.labs.observerobservable;

public class WeatherDemo {

	public static void main(String[] args) {
		WeatherObserver observer = new WeatherObserver();
		WeatherManager observable = new WeatherManager();
		observable.addObserver(observer);
		observable.setTemperature(20);
	}
}
