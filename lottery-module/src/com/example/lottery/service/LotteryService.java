package com.example.lottery.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@FunctionalInterface
public interface LotteryService {
	List<Integer> draw(int max, int size); // SAM

	default List<List<Integer>> draw(int max, int size, int column){
		return IntStream.range(0, column)
				        .mapToObj( i -> this.draw(max, size))
				        .collect(Collectors.toList());
	}
}
