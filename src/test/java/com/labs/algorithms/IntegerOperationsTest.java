package com.labs.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerOperationsTest {

	IntegerOperations integerOperations = new IntegerOperations();
	
	@Test
	public void reverseTest() {
		assertEquals(integerOperations.reverse(123), 321);
	}
}

