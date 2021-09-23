package com.example;

public class StudyRecord {

	public static void main(String[] args) {
		Calisan jack1 = new Calisan("11111111110", "jack bauer", "TR1", 100_000);
		Calisan jack2 = new Calisan("11111111110", "jack bauer", "TR1", 100_000);
		System.out.println(jack1.toString());
		System.out.println(jack1.hashCode());
		System.out.println(jack2.hashCode());
		System.out.println(jack1.equals(jack2));
		System.out.println(jack1.fullname());
		
		
		Employee jack3 = new Employee("11111111110", "jack bauer", "TR1", 100_000);
		Employee jack4 = new Employee("11111111110", "jack bauer", "TR1", 100_000);
		System.out.println(jack3.getIban());
		System.out.println(jack3.toString());
		System.out.println(jack3.hashCode());
		System.out.println(jack4.hashCode());
		System.out.println(jack3.equals(jack4));
	}

}

// Immutable
record Calisan(String identity,String fullname,String iban,double salary) {

	@Override
	public String toString() {
		return "Calisan [identity=" + identity + ", fullname=" + fullname + ", iban=" + iban + ", salary=" + salary
				+ "]";
	}
	
	public void fun() {
		
	}
	public static void gun() {
		
	}
}

final class Employee extends Object {
	private final String identity;
	private final String fullname;
	private final String iban;
	private final double salary;

	public Employee(String identity, String fullname, String iban, double salary) {
		this.identity = identity;
		this.fullname = fullname;
		this.iban = iban;
		this.salary = salary;
	}

	public String getIdentity() {
		return identity;
	}

	public String getFullname() {
		return fullname;
	}

	public String getIban() {
		return iban;
	}

	public double getSalary() {
		return salary;
	}

}