package com.labs.algorithms;

import org.junit.Test;

public class IsmorphicTest {

	Ismorphic ismorphic = new Ismorphic();

	/*
	@Test
	public void printAsciiCharacters() {
		asciiCharacters.printAsciiCharacters();
	}
	*/
	
	@Test
	public void isUniqCharSet() {
		String s1 = "badc";
		String s2 = "baba";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(ismorphic.isIsomorphic(s1, s2));
		
	}
}
