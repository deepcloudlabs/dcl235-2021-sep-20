package com.example;

import java.util.Objects;

public class StudyInstanceOf {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		A a1 = new C();
		D d2 = null;
		// Before Java 14
		if (a1 instanceof D) {
			d2 = (D) a1;
		}
		// Since Java 14
		if (a1 instanceof D d1 && Objects.nonNull(d1) && d1 instanceof X) {
		   // d1
		}

	}

}

class Customer {
    private String identity;
    private String fullname;
    private String email;
    private String phone;

    public Customer(String identity, String fullname, String email, String phone) {
        this.identity = identity;
        this.fullname = fullname;
        this.email = email;
        this.phone = phone;
    }



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fullname == null) ? 0 : fullname.hashCode());
		result = prime * result + ((identity == null) ? 0 : identity.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Customer)) {
			return false;
		}
		Customer other = (Customer) obj;
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		if (fullname == null) {
			if (other.fullname != null) {
				return false;
			}
		} else if (!fullname.equals(other.fullname)) {
			return false;
		}
		if (identity == null) {
			if (other.identity != null) {
				return false;
			}
		} else if (!identity.equals(other.identity)) {
			return false;
		}
		if (phone == null) {
			if (other.phone != null) {
				return false;
			}
		} else if (!phone.equals(other.phone)) {
			return false;
		}
		return true;
	}

	//@Override
    public boolean equals1(Object o) {
        return o instanceof Customer cust 
        		&& Objects.nonNull(cust)
                && cust.identity.equals(identity)
                && cust.fullname.equals(fullname)
                && cust.email.equals(email)
                && cust.phone.equals(phone);
    }

}

class A {}
class B extends A {}
class C extends A implements X {}
class D extends B implements Z {}

interface X {}
interface Y {}
interface Z extends X,Y {}
