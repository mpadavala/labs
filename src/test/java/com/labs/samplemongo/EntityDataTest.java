package com.labs.samplemongo;

import org.junit.Test;

import com.padavala.labs.samplemongo.EntityData;

public class EntityDataTest {

	
	@Test
	public void addDocuments(){
		EntityData entityData = new EntityData();
		entityData.addDocuments(2000);
	}
}
