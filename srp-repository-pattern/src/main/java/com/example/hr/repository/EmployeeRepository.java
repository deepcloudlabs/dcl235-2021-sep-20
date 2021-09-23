package com.example.hr.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.hr.entity.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String>{
	Employee findTopByOrderBySalaryDesc();
	List<Employee> findTop10ByOrderByBirthYearDesc();
}
