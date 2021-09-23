package com.example.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.example.dao.InMemoryWorldDao;
import com.example.domain.Country;

public class Exercise01 {
	/**
	 * 
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		InMemoryWorldDao worldDao = InMemoryWorldDao.getInstance();
		List<Country> countries = worldDao.findAllCountries();
		// find asian countries name in a sorted list by dictionary order, descending
		// imperative -> procedural programming, oop
		List<String> namesOfAsianCountries = new ArrayList<>();
		for (Country country : countries) {
			if ("Asia".equals(country.getContinent())) {
				String countryName = country.getName();
				namesOfAsianCountries.add(countryName);
			}
		}
		Collections.sort(namesOfAsianCountries, new DictionaryDescendingOrder());
		printCountryNames(namesOfAsianCountries);
		// declarative programming -> functional programming + oop
		// Language (Lambda Expression + Method Reference) + API (Collection API + Stream API)
		// Function -> Interface (SAM) -> @FunctionalInterface
		Predicate<Country> isAsian = new Predicate<Country>() {

			@Override
			public boolean test(Country country) {
				return "Asia".equals(country.getContinent());
			}
		};
		Predicate<Country> isAsianLambda = country -> {
			System.err.println("isAsianLambda");
			return "Asia".equals(country.getContinent());
		};
		/* final */ Integer counter[] = {0}; // effectively final
		Function<Country, Integer> toCountryPopulation = 
				country -> { // pure function
					counter[0]++; // side-effect!!!
					country.setName(""); // side-effect!!! -> Immutable Classes
			        System.err.println(counter); // compiler does not allow side-effects!
					return country.getPopulation();
		        };
		// Function<Country, String> toCountryName = Country::getName; // method reference
		Function<Country, String> toCountryName = country -> {
			System.err.println("toCountryName");
			return country.getName();
		};
		Comparator<String> descendingDictionaryOrder = 
				(s1,s2) -> s2.compareToIgnoreCase(s1);
		Comparator<String> asendingDictionaryOrder = 
				descendingDictionaryOrder.reversed();
		Consumer<String> printToConsole = System.err::println;
		System.err.println("\n\ndeclarative programming\n\n");
		// Functional Programming
		// Higher-order Functions: filter/map/sorted/forEach
		// Stream API: i) intermediator functions ii) terminal functions
		// Lazy Evaluation
		// Pure Function: isAsianLambda, toCountryName,printToConsole,...
		countries.stream()
				 //.parallel()
		         .filter(isAsianLambda) // Functional Interface -> Predicate<Country>
		         .map(toCountryName) // Functional Interface
		         .sorted(descendingDictionaryOrder.reversed()) // Functional Interface
		         .forEach(printToConsole); // Functional Interface
		
	}

	private static void printCountryNames(List<String> namesOfAsianCountries) {
		for (String countryName: namesOfAsianCountries)
			System.err.println(countryName);
	}

}

class DictionaryDescendingOrder implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s2.compareToIgnoreCase(s1);
	}
	
}