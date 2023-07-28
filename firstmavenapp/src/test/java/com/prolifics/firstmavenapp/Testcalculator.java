package com.prolifics.firstmavenapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Testcalculator {
	calculator c=null;
	@BeforeEach
	public void setup()throws Exception{
		c=new calculator();

	}
	@AfterEach
	public void tearDown()throws Exception{
		calculator c=null;
	}
	@Test
	public void testsquare() {
		assertEquals(225,c.square(15));
	}
	@Test
	public void testsum() {
		assertEquals(15,c.sum(2,6,3,4));
	}
	@Test
	public void testpower() {
		assertEquals(16,c.power(2, 4));
	}
	
	
}
