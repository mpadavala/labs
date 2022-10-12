package com.labs.algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

public class ReverseIntegerTest {

	ReverseInteger revInt = new ReverseInteger();
	
	@Test
	public void reverseIntegerTest() {
		System.out.println(revInt.reverse(1233431239));
		//assertEquals(revInt.reverse(-1234), -4321);
		//assertEquals(revInt.reverse(2147483640), 463847412);
		//assertNotSame(revInt.reverse(1234), -4321);
	}
}
