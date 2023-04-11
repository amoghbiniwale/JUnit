package com.aurionpro.model;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
	Employee emp;// = new Employee(01, "amogh", 40000);

	@BeforeEach
	void init() {
		System.out.println("before each");
		emp = new Employee(01, "amogh", 40000);
	}

	@AfterEach
	void afterEach() {
		System.out.println("after each");
		//emp = new Employee(01, "amogh", 40000);
	}

	@AfterEach
	void afterAll() {
		System.out.println("after each");
		//emp = new Employee(01, "amogh", 40000);
	}

	@Test
	void TestGetHra() {
		System.out.println(emp.getHra());
		assertEquals(0.2, emp.getHra());

	}

	@Test
	void TestGetTa() {
		System.out.println(emp.getTa());
		assertEquals(0.1, emp.getTa());
	}

	@Test
	void TestGetDa() {
		emp.setHra(2000);
		emp.setDa(1000);
		System.out.println(emp.getDa());
		assertEquals(1000.0, emp.getDa());
	}

	@Test
	void TestCalculateAnnualCTC() {

		System.out.println(emp.calculateAnnualCTC());
		assertEquals(40001.549999999996, emp.calculateAnnualCTC());
	}

	@Test
	void TestCalculateMontlySal() {
		System.out.println(emp.calculateMonthlySalry());
		assertEquals(40000, emp.calculateMonthlySalry());

	}

}
