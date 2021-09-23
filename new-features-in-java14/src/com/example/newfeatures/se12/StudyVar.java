package com.example.newfeatures.se12;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class StudyVar {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// var is used only with local variables!
		Map<String,Function<List<String>,String>> functionLookup =
				new HashMap<String,Function<List<String>,String>>();
		// Java SE 7+
		Map<String,Function<List<String>,String>> functionLookup7 =
				new HashMap<>(); // Diamond Operator
		// Java SE 10+
		var functionLookup10 = new HashMap<String,Function<List<String>,String>>();
		
		var var = 0L; // long
		
		final var names = List.of(
				"jack", "kate", "james", 
				123.0, 
				true, 42, BigInteger.valueOf(111111)
	    );
	}

}
