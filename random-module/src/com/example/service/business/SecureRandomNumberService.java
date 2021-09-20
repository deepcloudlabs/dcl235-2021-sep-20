package com.example.service.business;

import java.security.SecureRandom;

import com.example.service.RandomNumberService;

public class SecureRandomNumberService implements RandomNumberService {
	private SecureRandom random = new SecureRandom();

	@Override
	public int generate(int min, int max) {
		System.err.println("SecureRandomNumberService::generate");
		return random.nextInt(max - min + 1) + min;
	}

}
