package com.learning.intrface.privat;

public class TestClass implements InterfPrivateMethod {
	// This class implements the InterfPrivateMethod interface
	public static void main(String[] args) {
		TestClass test = new TestClass();
		test.add(5, 10); // This will call the default method which uses the private method
		System.out.println("TestClass main method executed.");
	}
}
