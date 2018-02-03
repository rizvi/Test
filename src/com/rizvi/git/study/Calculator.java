package com.rizvi.git.study;

public class Calculator {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		System.out.println("Summation: " + addition(a, b));
		System.out.println("Multiplication: " + multiplication(a, b));
	}

	private static int multiplication(int a, int b) {
		return a * b;
	}

	private static int addition(int a, int b) {
		return a + b;
	}
}
