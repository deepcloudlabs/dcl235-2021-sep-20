package com.example.lottery.application;

import java.util.ServiceLoader;

import com.example.lottery.service.business.StandardLotteryService;
import com.example.service.RandomNumberService;

public class LotteryApplication {

	public static void main(String[] args) {
		StandardLotteryService lotteryService = new StandardLotteryService();
		ServiceLoader<RandomNumberService> services =
				ServiceLoader.load(RandomNumberService.class);
		// Design Pattern: Strategy Pattern
		var iter = services.iterator();
		iter.next();
		RandomNumberService randomNumberService = iter.next();
		lotteryService.setRandomNumberService(randomNumberService );
		lotteryService.draw(60, 6, 10)
		              .forEach(System.err::println);

	}

}
