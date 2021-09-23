package com.example.exercises;

import static java.math.BigInteger.TWO;
import static java.math.BigInteger.ONE;

import java.math.BigInteger;
import java.util.stream.Stream;

public class StudyParallelStreams {

	public static void main(String[] args) {
		primes().map( prime -> TWO.pow(prime.intValueExact()).subtract(ONE))
		        .filter(mersenne -> mersenne.isProbablePrime(50))
		        .limit(20)
		        .forEach(System.out::println);
	}
	public static Stream<BigInteger> primes(){
		return Stream.iterate(TWO, BigInteger::nextProbablePrime);
	}
}
