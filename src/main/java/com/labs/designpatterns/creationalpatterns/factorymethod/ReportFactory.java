package com.labs.designpatterns.creationalpatterns.factorymethod;

public class ReportFactory {

	public static Report getReport(ReportType reportType){
		
		if(reportType.equals(ReportType.PDF)){
			return new PdfReport();
		}else if(reportType.equals(ReportType.EXCEL)){
			return new ExcelReport();
		}else if(reportType.equals(ReportType.CSV)){
			return new CsvReport();
		}else{
			throw new RuntimeException("Invalid ReportType");
		}
	}
	
}
