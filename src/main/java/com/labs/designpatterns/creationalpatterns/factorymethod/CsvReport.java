package com.labs.designpatterns.creationalpatterns.factorymethod;

public class CsvReport implements Report{

	@Override
	public void generate() {
		System.out.println("Generating CSV Report");
	}

}
