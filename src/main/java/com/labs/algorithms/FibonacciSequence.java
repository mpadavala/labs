package com.labs.algorithms;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {
	
	public List<Long> generate(int count) {
		
		if(count <=0) return null;
		
		long first=1, second=1;
		List<Long> sequence = new ArrayList<Long>();
		for(int i=1; i<=count; i++){
			if(i <= 2) { 
				sequence.add(1l);
				continue;
			}
			long next = first+second;
			sequence.add(next);
			first = second;
			second = next;
		}
		return sequence;
	}
	
	
	public void printList(List<Long> sequence) {
		
		if(sequence == null) return;
		
		for(Long item : sequence) {
			System.out.println(item);
		}
	}
}

	