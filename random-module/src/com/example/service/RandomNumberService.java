package com.example.service;

// Interface Segregation Principle
public interface RandomNumberService {
	int generate(int min, int max); // [min,max]

	default int generate(int max) {
		return generate(1, max);
	} // [1,max]
}
