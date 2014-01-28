package com.padavala.labs.samplemongo;

import org.junit.Test;

public class MongoDocumentsTest {
	
	@Test
	public void addDocuments(){
		MongoDocuments mongoDocuments = new MongoDocuments();
		mongoDocuments.addDocuments(2);
	}

}
