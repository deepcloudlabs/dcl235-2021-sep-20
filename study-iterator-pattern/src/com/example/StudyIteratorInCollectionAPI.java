package com.example;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;

public class StudyIteratorInCollectionAPI {

	public static void main(String[] args) {
		Collection<Integer> numbers = new LinkedList<>(List.of(4,8,15,16,23,42));
		Iterator<Integer> iter = numbers.iterator();
		while(iter.hasNext()) { // external loop
			var number = iter.next();
			System.err.println(number);
		}
		// Java SE 5
		// external loop
		for (var number : numbers) { // for-each: read-only
			System.err.println(number);
		}
		// Java SE 8
		// internal loop + Stream API (Filter/Map/Reduce)
		numbers.parallelStream().forEach(System.err::println);
		
		Spliterator<Integer> spliterator = numbers.spliterator();
	}

}
