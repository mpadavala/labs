package com.labs.algorithms;

import java.util.List;

import org.junit.Test;

public class FibonacciSequenceTest {

	FibonacciSequence fibonacciSequence = new FibonacciSequence();
	
	@Test
	public void reverseTest() {
		
		List<Long> sequence = fibonacciSequence.generate(50);
		fibonacciSequence.printList(sequence);
	}
	
}
