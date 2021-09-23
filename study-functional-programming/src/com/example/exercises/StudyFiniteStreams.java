package com.example.exercises;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StudyFiniteStreams {

	public static void main(String[] args) {
		var numbers = IntStream.range(0, 600_000).map(i -> 1).boxed().collect(Collectors.toList());
		long duration = 0;
		for (var i = 0; i < 10; ++i) { 
			// 10^3: Serial: 1.4 ms. , Parallel: 3.6 ms.
			// 10^4: Serial: 1.6 ms. , Parallel: 3.3 ms.
			// 10^5: Serial: 3.3 ms. , Parallel: 6.5 ms.
			// 5 x 10^5: Serial: 8.1 ms. , Parallel: 8.6 ms.
			// 75 x 10^4: Serial: 11.0 ms. , Parallel: 8.8 ms.
			// 10^6: Serial:  22 ms. , Parallel:   9 ms.
			// 10^7: Serial:  100.7 ms., Parallel:   24.9 ms.
			// 10^8: Serial:  1002.2 ms. , Parallel: 195.3 ms.
			long start = System.currentTimeMillis();
			var myStream = numbers.stream();
			if (numbers.size() > 500_000)
				myStream = myStream.parallel();
			var sum = myStream.mapToLong(Long::valueOf).sum();
			long stop = System.currentTimeMillis();
			duration += stop - start;
			System.err.println(String.format("Sum: %d, Duration: %d", sum, stop - start));
		}
		System.err.println(String.format("Average duration: %3.1f ms.", duration / 10.));
	}

}
