package com.testF.spring.services.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.testF.spring.dataaccess.EmployeeDao;
import com.testF.spring.dataaccess.RecordNotFoundException;
import com.testF.spring.domain.Employee;

@Transactional
@Service
public class EmployeeManagementServiceImpl implements EmployeeManagementService {

	
	EmployeeDao dao;
	
	@Autowired
	public EmployeeManagementServiceImpl(EmployeeDao dao){
		this.dao = dao;
	}

	@Override
	public void addEmployee(Employee e) {
		dao.createEmployee(e);
		
	}

	@Override
	public void removeEmployee(Employee e) throws RecordNotFoundException {
		dao.deleteEmployeeById(e);		
	}

	@Override
	public Employee findEmployeeById(int id) throws RecordNotFoundException {
		return dao.findEmployeeById(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return dao.getAllEmployees();
	}
	



}
