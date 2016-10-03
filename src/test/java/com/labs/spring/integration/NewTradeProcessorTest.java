package com.labs.spring.integration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.padavala.labs.spring.integration.Trade;

public class NewTradeProcessorTest {

	private ApplicationContext context = null;
	//private MessageChannel channel = null;
	
	public NewTradeProcessorTest(){
		context = new ClassPathXmlApplicationContext("basics-example-beans.xml");
		//channel = ctx.getBean("trades-channel", MessageChannel.class);
	}
	
	public Trade createNewTrade(int id){
		Trade trade = new Trade(id);
		return trade;
	}

	public void sendTrade(){
		Trade trade = createNewTrade(1);
		//MessageBuilder.
		
	}
	
	
	public static void main(String args[]){
		NewTradeProcessorTest test  = new NewTradeProcessorTest();
		test.sendTrade();
	}
}