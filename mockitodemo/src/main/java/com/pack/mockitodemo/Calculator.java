package com.pack.mockitodemo;

public class Calculator {

	public int performCalculation(CalculatorService cs) {
		System.out.println("Performing Calculation");
		return cs.add(10, 20);
	}
}
