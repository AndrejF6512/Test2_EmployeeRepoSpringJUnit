package com.testF.spring.services.employee;

import java.util.List;

import com.testF.spring.dataaccess.RecordNotFoundException;
import com.testF.spring.domain.Employee;

public interface EmployeeManagementService {

	public void addEmployee(Employee e);
	public void removeEmployee(Employee e) throws RecordNotFoundException;
	public Employee findEmployeeById(int id) throws RecordNotFoundException;
	
	public List<Employee> getAllEmployees();

}
