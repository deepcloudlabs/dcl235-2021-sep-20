package com.example.newfeatures.se12;

public class StudyTextBlocks {
	@SuppressWarnings("unused")
	private static final String SELECT_EMPLOYEES = 
	          "SELECT IDENTITY, FULLNAME, IBAN, SALARY" 
	        + " FROM EMPLOYEES"
			+ " WHERE IDENTITY = ?";

	private static final String SELECT_EMPLOYEES2 = """
SELECT IDENTITY, FULLNAME, IBAN, SALARY \
 FROM EMPLOYEES\
 WHERE IDENTITY
			""";

	public static void main(String[] args) {
		System.out.println(SELECT_EMPLOYEES2);
	}

}
