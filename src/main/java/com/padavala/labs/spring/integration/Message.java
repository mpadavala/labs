package com.padavala.labs.spring.integration;

public interface Message<T> {
	
	public T getPayLoad();
	public MessageHeaders getHeaders();

}
