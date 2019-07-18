package com.pack.mockitodemo;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestCalculator {

	Calculator c1 = null;
//	CalculatorService  cs = new CalculatorService() {
//		
//		public int add(int a, int b) {
//			return a+b;
//		}
//	};
	CalculatorService cs = Mockito.mock(CalculatorService.class);
	
	@Before
	public void createObject() {
		System.out.println("Object Created ...");
		c1 = new Calculator();
	}
	
	@After
	public void removeObject() {
		System.out.println("Object Dereferenced...");
		c1 = null;
	}
	
	@Test
	public void testOperation() {
		assertEquals(0, c1.performCalculation(cs));
		System.out.println("Tested operation...");
	}
	
	

}
