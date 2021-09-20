package com.example;

import java.io.Serializable;
import java.math.BigDecimal;

public class InterfacesNewFeatures {

	public static void main(String[] args) {
		int w = 42; // type: int -> primitive type
		BigDecimal b = BigDecimal.valueOf(123.456); // type: class -> BigDecimal
		S f = null; // type: function
		f = new S() { // Anonymous Class (1)
			
			@Override
			public int fun(int x, int y) {
				return x*y;
			}
		};
		f = (int x, int y) -> { // lambda expression (2)
			return x*y;
		};
		f = (x,y) -> x*y; // short-cut to the previous lambda expression
		// method reference (3)
		T t = new T();
		f = t::gun; // 3.1 (object's method)
		f = S::mul; // 3.2 (static method)
		
	}

}
class T {
	public int gun(int x,int y) {
		return x*y;
	}
}
// Functional Programming
// Functional Interface (# of abstract methods: 1)
@FunctionalInterface // (1) // since java 8
interface S { // Interface Segregation Principle
	public int fun(int x,int y); // Single Abstract Method (SAM)
	public static int mul(int x,int y) { // static method (2) // since java 8
		return multiply(x, y);
	}
	public default int sun(int x) { return carp(x, x); } // default method (3) // since java 8
	private static int multiply(int x,int y) { // private static method (4), since java 9
		return x*y;
	}
	private int carp(int x,int y) {return x*y;} // private method (5), since java 9
}

// Marker Interface (# of abstract methods: 0) like Serializable
interface R {}
