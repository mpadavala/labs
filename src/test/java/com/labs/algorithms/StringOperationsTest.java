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
	
	@Test
	public void removeDuplicatesTest() {
		assertEquals(strOps.removeDuplicates(null), null);
		assertEquals(strOps.removeDuplicates("Murali"), "Murali");
		assertEquals(strOps.removeDuplicates("padavala"), "pad v l ");
		//System.out.println(strOps.removeDuplicates("Ananya Padavala"));
		assertEquals(strOps.removeDuplicates("Ananya Padavala"), "Ana y  P d v l ");
	}
	
	@Test
	public void replaceSpaceWithTest() {
		assertEquals(strOps.replaceSpaceWith(null, null), null);
		assertEquals(strOps.replaceSpaceWith("Murali Padavala", "%20"), "Murali%20Padavala");
		//System.out.println(strOps.replaceSpaceWith("Hello World !! ", "%20"));
		assertEquals(strOps.replaceSpaceWith("Hello World !! ", "%20"), "Hello%20World%20!!%20");
		
	}
	
	
	
}
