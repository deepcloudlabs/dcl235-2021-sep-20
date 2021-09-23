package com.example.hr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.hr.repository.EmployeeRepository;

@SpringBootApplication
public class SrpRepositoryPatternApplication implements ApplicationRunner {
	@Autowired
	private EmployeeRepository empRepo;

	public static void main(String[] args) {
		SpringApplication.run(SrpRepositoryPatternApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
//		Department sales = new Department(1L, "SALES");
//		Employee jack = new Employee("1","Jack Bauer",
//				"TR1", 100_000, 1956, true, sales );
//		empRepo.save(jack);

//		empRepo.findAll().forEach(System.err::println);
		empRepo.findTop10ByOrderByBirthYearDesc().forEach(System.err::println);
	}

}
