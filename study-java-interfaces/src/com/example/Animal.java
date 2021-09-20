package com.example;

public abstract class Animal { // cannot instantiate
	private int legs; // can have data/attribute/state

	public Animal(int legs) { // can have constructor
		this.legs = legs;
	}

	public int getLegs() { // concrete method
		return legs;
	}

	public void walk() { // concrete method
		System.err.println(String.format("Animal with %d legs is walking now...", legs));
	}

	abstract public void eat(); // abstract method 
}
