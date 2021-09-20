package com.example;

// Concrete Class -> can create an object using new
public class Spider extends Animal { 

	public Spider() {
		super(8);
	}

	@Override
	public void eat() {
		System.err.println("Spider is eating now...");
	}

}
