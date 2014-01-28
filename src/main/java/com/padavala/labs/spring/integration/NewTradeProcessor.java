package com.padavala.labs.spring.integration;

public class NewTradeProcessor {

	public void processNewTrade(Trade trade){
		
		System.out.println("Trade : " + trade);
	}
}
