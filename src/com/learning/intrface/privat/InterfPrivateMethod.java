package com.learning.intrface.privat;

public interface InterfPrivateMethod {
	
	private  void calculate(int a, int b) {
		System.out.println("Calculating sum of " + a + " and " + b);
	}
	
	default void add(int a, int b) {
		calculate(a, b);
		System.out.println("Sum is " + (a + b));
	}
}
