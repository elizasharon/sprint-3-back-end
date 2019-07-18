package com.pack.testingdemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {

	Calculator c1;
	
	@Before
	public void createObject() {
		c1 = new Calculator();
		System.out.println("Object Created");
	}
	
	@After
	public void removeObject() {
		c1 = null;
		System.out.println("Object Dereferenced");
	}
	
	@Test
	public void testAdd() {
		assertEquals("Error In addition logic",30, c1.add(10, 20));
		System.out.println("Test Add");
	}

	@Test
	public void testSub() {
		assertEquals("Error in Subtraction logic", -30, c1.sub(10, 40));
		System.out.println("Test Sub");
	}
	
	@Test
	public void isEqual() {
		assertTrue("Not Equal",c1.compare(10, 10));
	}
	
	@Test
	public void isNotEqual() {
		assertFalse("Equal",c1.compare(150, 10));
	}
	
}
