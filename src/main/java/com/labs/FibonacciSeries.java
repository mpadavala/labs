package com.labs;
public class FibonacciSeries {

	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		fibonacciSeries.printArray(fibonacciSeries.generateFibonacciSeries(20));
	}
	
	public long[] generateFibonacciSeries(int number){
		
		long[] series = new long[number];
		if(number==1){
			series[0] = 0;
		}else if(number>=2){
			series[0] = 0;
			series[1] = 1;
			for(int i=2; i<number; i++){
				
				series[i]=series[i-1]+series[i-2];
			}
		}
		return series;
	}
	
	public void printArray(long[] series){
		for(int i=0; i<series.length; i++){
			System.out.println(series[i]);
		}
	}
	
}
