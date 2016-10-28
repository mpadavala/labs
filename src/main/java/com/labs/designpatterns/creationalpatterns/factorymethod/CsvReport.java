package com.labs.designpatterns.creationalpatterns.factorymethod;

public class CsvReport implements Report{

	public void generate() {
		System.out.println("Generating CSV Report");
	}

}
