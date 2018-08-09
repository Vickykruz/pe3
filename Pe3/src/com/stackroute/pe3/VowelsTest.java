package com.stackroute.pe3;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class VowelsTest {
Vowels a = new Vowels();
String[] sr = { "India","United States","Germany","Egypt","Czechoslovakia"};
	@Test
	public void testVowel() {
		
		assertEquals("nd,ntd stts,Grmny,gypt,Czchslvk",a.vowel(sr));
		assertNotEquals("nda,ntd stats,Germy,Egypt,Czecchslvk",a.vowel(sr));
	}

}
