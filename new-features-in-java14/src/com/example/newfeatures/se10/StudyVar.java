package com.example.newfeatures.se10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class StudyVar {

	public static void main(String[] args) {
		var x = 42; // int
		var y = Integer.valueOf(42); // Integer
		var z = new ArrayList<Integer>();
		var numbers = new Random().ints(1, 50).distinct().limit(6).sorted().boxed().collect(Collectors.toSet());
		// error: var fun = () -> { };
		Consumer<Integer> gun = System.out::println;
		Predicate<Integer> isOdd = i -> i % 2 == 1;
		var isEven = isOdd.negate();
		var nums = Arrays.asList(4, 8, 15, 16, 23, 42);
		for (var i : nums)
			System.out.println(i);
		for (var i = 0; i < 10; ++i)
			System.out.println(i);
		try (var res1 = new MyResource(); var res2 = new MyResource(); var res3 = new MyResource();) {
			// using resources res1 and res2
			throw new IllegalArgumentException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class MyResource implements AutoCloseable {
	public void close() throws Exception {
		System.err.println("Closing the resource...");
	}
}

@SuppressWarnings("unused")
class Circle<T> {
	private T x; // Type Erasure ===> Object

}