package com.example.newfeatures.se11;

import java.util.List;
import java.util.function.Predicate;

@SuppressWarnings("unused")
public class VarWithLambda {

	public static void main(String[] args) {
		Predicate<List<Integer>> isOdd = 
				(@NotNull var i) -> i.size() ==1 ;

	}

}
