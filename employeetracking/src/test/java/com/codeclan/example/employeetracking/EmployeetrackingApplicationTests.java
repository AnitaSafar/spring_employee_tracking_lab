package com.codeclan.example.employeetracking;

import com.codeclan.example.employeetracking.models.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeetrackingApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee() {
		Employee peter = new Employee("Peter Parker", 24, 43, "peter.p@yahoo.com");
		employeeRepository.save(peter);
	}

}
