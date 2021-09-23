package com.example.exercises;

public class StudyImmutabelity {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		long start = System.currentTimeMillis();
		for (var i = 0;i<15_000_000;++i)
			s.append(i);
		long stop = System.currentTimeMillis();
		System.out.println("s.length: "+s.length()+" @ "+(stop-start)+" ms.");
	}

}
