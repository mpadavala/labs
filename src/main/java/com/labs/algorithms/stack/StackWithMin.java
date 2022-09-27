package com.labs.algorithms.stack;

import java.util.Stack;

import com.labs.algorithms.stack.StackWithMin.NodeWithMin;

public class StackWithMin extends Stack<NodeWithMin>{

	/**
	 * How would you design a stack which, in addition to push and pop, also has a function min 
	 * which returns the minimum element? Push, pop and min should all operate in O(1) time
	 * 
	 */
	
	
	public void push(int value) {
		
		int minValue = getMin();
		if(value < minValue) minValue = value;
		this.push(new NodeWithMin(value,  minValue));
		
	}
	
	private int getMin() {
		
		if(this.isEmpty()) {
			return Integer.MAX_VALUE;
		}else {
			return this.peek().getMinValue();
			
		}
	}
	
	public NodeWithMin pop() {
		return super.pop();
	}
	
	public int popValue() {
		return super.pop().getValue();
	}

	public int popMinValue() {
		return super.pop().getMinValue();
	}
	

	class NodeWithMin{
		private int value;
		private int minValue;
		
		
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		public int getMinValue() {
			return minValue;
		}
		public void setMinValue(int minValue) {
			this.minValue = minValue;
		}
	
		public NodeWithMin(int value, int minValue) {
			super();
			this.value = value;
			this.minValue = minValue;
		}
		
		
	}
	
}
