package com.labs.designpatterns.creationalpatterns.factorymethod;

public class PdfReport implements Report {

	@Override
	public void generate() {
		System.out.println("Generating PDF Report");
	}

}
