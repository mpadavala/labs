package com.padavala.labs.samplemongo;

import org.junit.Test;

public class EntityDataTest {

	
	@Test
	public void addDocuments(){
		EntityData entityData = new EntityData();
		entityData.addDocuments(2000);
	}
}
