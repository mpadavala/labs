package com.labs;

public class BitwiseOperators {

	public static void main(String[] args) {
		BitwiseOperators bitwiseOperators = new BitwiseOperators();
		bitwiseOperators.bitwiseAndOperator(2, 9);
		bitwiseOperators.bitwiseOrOperator(6, 3);
		bitwiseOperators.bitwiseComplimentOperator(6);
		
		bitwiseOperators.bitwiseLeftShiftOperator(6, 4);
		bitwiseOperators.bitwiseRightShiftOperator(8, 5);
		bitwiseOperators.bitwiseRightShiftZeroFillOperator(8,5);
		
		bitwiseOperators.xorExample(5,4);
		bitwiseOperators.swapNumbers();
		
	}
	
	public void xorExample(int first, int second ) {
		System.out.println("XOR of " + first + " and " + second + " is = " + (first^second));
		System.out.println("XOR in Java is a bitwise operator");
	}
	
	public void swapNumbers(){
		int x = 5;
		int y = 6;
		System.out.println("x initially  : " + x);
		System.out.println("y initially  : " + y);
		x = x^y;
		y = x^y;
		x = x^y;
		
		System.out.println("x afer swapping  : " + x);
		System.out.println("y afer swapping  : " + y);
	}
	
	public void binaryRepresentation(int input){
		System.out.println("Binary Representation of " + input + " is = " + Integer.toBinaryString(input));
	}
	
	public void bitwiseAndOperator(int first, int second){
		int result = first&second;
		binaryRepresentation(first);
		binaryRepresentation(second);
		System.out.println("bitwise And Operations of " + first + " & " + second + " = " + result);
		binaryRepresentation(result);
	}
	
	public void bitwiseOrOperator(int first, int second){
		int result = first|second;
		binaryRepresentation(first);
		binaryRepresentation(second);
		System.out.println("bitwise OR Operations of " + first + " | " + second + " = " + result);
		binaryRepresentation(result);
	}
	
	public void bitwiseComplimentOperator(int first){
		int result = ~first;
		binaryRepresentation(first);
		System.out.println("bitwise NEGATION Operations of " + first + " = " + result);
		binaryRepresentation(result);
	}
	
	public void bitwiseLeftShiftOperator(int number, int howMany){
		int result = number << howMany;
		binaryRepresentation(number);
		System.out.println("bitwise << Operations of " + number + " by " + howMany + " shifts is  = " + result);
		binaryRepresentation(result);
	}
	
	public void bitwiseRightShiftOperator(int number, int howMany){
		int result = number >> howMany;
		binaryRepresentation(number);
		System.out.println("bitwise >> Operations of " + number + " by " + howMany + " shifts is  = " + result);
		binaryRepresentation(result);
	}
	
	public void bitwiseRightShiftZeroFillOperator(int number, int howMany){
		int result = number >>> howMany;
		binaryRepresentation(number);
		System.out.println("bitwise >>> Operations of " + number + " by " + howMany + " shifts is  = " + result);
		binaryRepresentation(result);
	}
}
