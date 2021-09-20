package com.example;

public class MultipleInheritance {
	public static void main(String[] args) {
		P p = new E();
		Q q = null;
		System.err.println(p instanceof E);
		// System.err.println(q instanceof E); // ✘ static analysis --> compile-time error
		System.err.println(q instanceof A); // no analysis ! ✔ -> produces false
	}
}

interface A {
}

interface B {
}

interface C {
}

interface D extends A, B, C { // multiple inheritance between interfaces
}

class P {
	int x;
}
class Q {}
class E extends P {
}

class F extends P {
}
// class G extends E, F {} // Java does not allow multiple inheritance between concrete classes