package com.labs.samplemongo;

import org.junit.Test;

import com.padavala.labs.samplemongo.MongoDocuments;

public class MongoDocumentsTest {
	
	@Test
	public void addDocuments(){
		MongoDocuments mongoDocuments = new MongoDocuments();
		mongoDocuments.addDocuments(2);
	}

}
