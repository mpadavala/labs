package com.labs.algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

public class StringOperationsTest {
	
	StringOperations strOps = new StringOperations();
	
	@Test
	public void reverseStringTest() {
		assertEquals(strOps.reverseString("Murali"), "ilaruM");
		assertNotSame(strOps.reverseString("Murali"), "ilauM");
		assertEquals(strOps.reverseString(""), "");
		assertEquals(strOps.reverseString(" "), " ");
		assertEquals(strOps.reverseString(null), null);
	}


}
