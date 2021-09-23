package com.example.newfeatures.se11;

public class NewStringFeatures {

	public static void main(String[] args) {
		String s= "*".repeat(10);
		System.out.println(s.isBlank());
		String line = "\u2000jack\u2000";
		System.out.println(line.isBlank());
		System.out.println(line);
		System.out.println("trim :"+line.trim());	
		System.out.println("strip:"+line.strip());	
		System.out.println(line.stripLeading());	
		System.out.println(line.stripTrailing());	
	}

}
