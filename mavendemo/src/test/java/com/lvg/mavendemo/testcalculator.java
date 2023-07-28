package com.lvg.mavendemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lvg.model.calculator;

class testcalculator {
 calculator c=null;
	@BeforeEach
	void setUp() throws Exception {
	
         c=new calculator();
         }
	@AfterEach
	void tearDown() throws Exception {
	
     c=null;
	}
	@Test
	public void testsum() {
		assertEquals(8,c.sum(4, 4));
	}
@Test
public void testpower() {
	assertEquals(16,c.power(2,4));
}
}
