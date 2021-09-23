package com.example.exercises;

import static java.util.Comparator.comparingInt;

import java.text.Collator;
import java.text.ParseException;
import java.text.RuleBasedCollator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Exercise02 {

	public static void main(String[] args) throws ParseException {
		// Collation -> ayşe == AYŞE, şima == shema, şule == schule, ???
		String basicRules=  "< a < b < c < ç < d < e < f < g < ğ < h "+
		        "< ı < i < j < k < l < m < n < o < ö < p "+
		       "< r < s < ş < t < u < ü < v < y < z ";
		String trExpension= "& şi ; she & ş ; sch & s ; ş & u ; ü & i ; ı " + 
		                    "& c ; ç & o ; ö & ğ ; g" ;
		final Collator collator= new RuleBasedCollator(basicRules + trExpension);
		Collator.getInstance(new Locale("tr","TR"));
		collator.setStrength(Collator.PRIMARY);		
		var names = new ArrayList<>(List.of("zeki", "ayşegül", "ali", "zehra", "şule", "şima", "sema"));
		names.sort(comparingInt(String::length).thenComparing(collator::compare) );
		names.forEach(System.out::println);
		Map<String,Integer> populations = Map.of("tur", 80_000_000, "usa", 350_000_000);
		//populations.merge("tur", 1, (population,increment) -> population + increment);
		populations.merge("tur", 1, Integer::sum);
	}

}
