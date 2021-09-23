package com.example.service;

import com.example.hr.repository.EmployeeRepository;
// Hexagonal Architecture (Clean Architecture)
@SuppressWarnings("unused")
public class BusinessService {
	private EmployeeRepository empRepo;

	public BusinessService(EmployeeRepository empRepo) {
		this.empRepo = empRepo;
	}
	
	public void fun() {}
	public void gun() {}
}
