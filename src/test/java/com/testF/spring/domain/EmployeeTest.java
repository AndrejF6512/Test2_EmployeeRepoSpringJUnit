package com.testF.spring.domain;

import com.testF.spring.domain.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	private static final double DELTA = 1e-15;
	@Test
	public void testClassConstructor() {
		
		int id = 100;
		String name = "Gregor";
		String surname = "Volny";
		double salary = 1000;
		
		Employee testEmployee = new Employee(id, name, surname, salary);
		
		assertEquals("Incorrect id", id, testEmployee.getId());
		assertEquals("Incorrect name", name, testEmployee.getName());
		assertEquals("Incorrect surname", surname, testEmployee.getSurname());
		assertEquals("Incorrect salary", salary, testEmployee.getSalary(), DELTA);//DELTA, because type double


	}

}
