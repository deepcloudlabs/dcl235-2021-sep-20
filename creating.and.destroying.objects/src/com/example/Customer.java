package com.example;

import java.util.List;
import java.util.Objects;

public class Customer { 

// Entity (DDD)
	private String customerNo;
	private String fullname;
	private String email;
	private String sms;
	private int birthYear;
	private byte[] photo;
	private List<String> addresses;
	
	private Customer(Builder builder) {
		this.customerNo = builder.customerNo;
		this.fullname = builder.fullname;
		this.email = builder.email;
		this.sms = builder.sms;
		this.birthYear = builder.birthYear;
		this.photo = builder.photo;
		this.addresses = builder.addresses;
	}
	
	public static class Builder {
		private String customerNo;
		private String fullname;
		private String email;
		private String sms;
		private int birthYear;
		private byte[] photo;
		private List<String> addresses;
		
		public Builder(String customerNo) {
			this.customerNo = customerNo;
		}
		
		public Builder fullname(String value) {
			Objects.requireNonNull(value);
			this.fullname = value;
			return this;
		}
		public Builder email(String value) {
			Objects.requireNonNull(value);
			this.email = value;
			return this;
		}
		public Builder sms(String value) {
			Objects.requireNonNull(value);
			this.sms = value;
			return this;
		}
		public Builder birthYear(int value) {
			if (value > 2006)
				throw new IllegalArgumentException("Birth year must be less than 2006");
			this.birthYear = value;
			return this;
		}
		public Builder photo(byte[] value) {
			Objects.requireNonNull(value);
			this.photo = value;
			return this;
		}
		public Builder addresses(String... values) {
			Objects.requireNonNull(values);
			this.addresses = List.of(values);
			return this;
		}
		public Customer build() {
			// composite validation
			// business rule
			Objects.requireNonNull(this.addresses);
			// pre-/post-conditions
			// invariants
		    return new Customer(this);
		}
	}

	@Override
	public String toString() {
		return "Customer [customerNo=" + customerNo + ", fullname=" + fullname + ", email=" + email + ", sms=" + sms
				+ ", birthYear=" + birthYear + ", addresses=" + addresses + "]";
	} 
	
}
