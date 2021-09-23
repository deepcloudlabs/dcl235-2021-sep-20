package com.example.exercises;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StudyLazyEvaluation {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,2,2,4,5,5,6,6,7,7,7,4,5,8,8);
		
		var distinctEvenNumbers = getDistinctEvenNumbers(numbers);
		System.err.println("Before forEach!!!");
		distinctEvenNumbers.forEach(System.err::println);
	}

	public static Collection<Integer> getDistinctEvenNumbers(List<Integer> nums){
		return nums.stream()
				   .filter(StudyLazyEvaluation::isEven)// Lazy Evaluation
				   .distinct()// Lazy Evaluation
				   .collect(Collectors.toList()); 
	} 
	
	public static boolean isEven(Integer number) {
		System.err.println("isEven");
		return number%2 == 0;
	}
}
