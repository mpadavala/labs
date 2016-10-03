package com.labs.designpatterns.creationalpatterns.factorymethod;

public class ExcelReport implements Report {

	@Override
	public void generate() {
		System.out.println("Generating Excel Report");
	}

}
