package com.labs.designpatterns.creationalpatterns.factorymethod;

public class ReportFactoryDemo {

	public static void main(String[] args) {
		
		Report report = ReportFactory.getReport(ReportType.PDF);
		report.generate();
		
		report = ReportFactory.getReport(ReportType.CSV);
		report.generate();
		
		report = ReportFactory.getReport(ReportType.EXCEL);
		report.generate();
		
	}
}
