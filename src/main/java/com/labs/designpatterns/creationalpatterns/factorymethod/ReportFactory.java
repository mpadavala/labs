package com.labs.designpatterns.creationalpatterns.factorymethod;

public class ReportFactory {
/*
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
	
*/
	
	/**
	 * Just to show how its implemented using switch
	 */
	public static Report getReport(ReportType reportType){
		
		switch(reportType){
			case PDF : {
				return new PdfReport();
			}case EXCEL : {
				return new ExcelReport();
			}case CSV : {
				return new CsvReport();
			}default : {
				return null;
			}
		}
		
	}

}
