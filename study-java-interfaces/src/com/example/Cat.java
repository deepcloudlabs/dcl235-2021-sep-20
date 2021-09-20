package com.example;

public class Cat extends Animal implements Pet {
	private String name;

	public Cat() {
		this("garfield");
	}

	public Cat(String name) {
		super(4);
		setName(name);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		System.err.println(String.format("%s is playing now...", name));
	}

	@Override
	public void eat() {
		System.err.println(String.format("%s is eating now...", name));
	}

}
