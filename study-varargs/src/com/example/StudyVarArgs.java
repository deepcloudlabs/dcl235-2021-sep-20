package com.example;

public class StudyVarArgs {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6,7,8,9,10};
		int []tmp= {1,2,3,4,5,6};
		System.out.println(add(1,2));
		System.out.println(add(1,2,3));
		System.out.println(add(1L,2,3,4,5,6)); // add(tmp);
		System.out.println(add(arr));
	}

	static int add(int x, int y) {
		return x+y;
	}
	static int add(int x, int y,int z) {
		return add(add(x,y),z);
	}
	static int add(int ...array) {
		int sum=0;
		for (int x: array) sum += x;
		return sum;
	}

	static int add(long init,int ...array) {
		long sum=init;
		for (int x: array) sum += x;
		return (int) sum;
	}
	
}
