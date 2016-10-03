package com.labs.callable;

import java.util.concurrent.Future;


public class Response{
	String key;
	Future<String> future;
	
	
	public Response(String key, Future<String> future) {
		super();
		this.key = key;
		this.future = future;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Future<String> getFuture() {
		return future;
	}
	public void setFuture(Future<String> future) {
		this.future = future;
	}
}