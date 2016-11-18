package com.labs.observerobservable;

import java.util.Observable;

public class WeatherManager extends Observable {

	private float temperature = 0;

	public void setTemperature(float temperature) {
		this.temperature = temperature;
		System.out.println("new temperature is set to : " + temperature);
		System.out.println("Notifying Observers");
		setChanged();
		notifyObservers();
	}

	public float getTemperature(){
		return this.temperature;
	}
	
}
