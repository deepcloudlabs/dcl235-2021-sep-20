package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.hr.repository.EmployeeRepository;
import com.example.service.BusinessService;

@Configuration
public class AppConfig {
	@Bean
	public BusinessService myBean(EmployeeRepository empRepo) {
		return new BusinessService(empRepo);
	}
}
