package com.labs.algorithms;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AsciiCharactersTest {
	
	AsciiCharacters asciiCharacters = new AsciiCharacters();

	/*
	@Test
	public void printAsciiCharacters() {
		asciiCharacters.printAsciiCharacters();
	}
	*/
	
	@Test
	public void isUniqCharSet() {
		assertTrue(asciiCharacters.isUniqCharSet("ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxy"));
		assertTrue(asciiCharacters.isUniqCharSet("Murali"));
		assertFalse(asciiCharacters.isUniqCharSet("MMMM"));
		assertFalse(asciiCharacters.isUniqCharSet("  "));
	}
	
	
}
