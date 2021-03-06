package com.example.service.business;

import java.util.concurrent.ThreadLocalRandom;

import com.example.service.RandomNumberService;

public class FastRandomNumberService implements RandomNumberService {

	@Override
	public int generate(int min, int max) {
		System.err.println("FastRandomNumberService::generate");
		return ThreadLocalRandom.current().nextInt(min, max+1);
	}

}
