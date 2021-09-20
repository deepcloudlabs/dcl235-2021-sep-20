package com.example;

public abstract interface Pet { // until java se 8
	public String getName();
	abstract void setName(String name);
	public abstract void play();
}
