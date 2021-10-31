package com.testF.spring.services.task;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testF.spring.domain.Employee;
import com.testF.spring.domain.Task;
import com.testF.spring.services.employee.EmployeeManagementService;

@Service("taskService")
public class TaskServiceImpl implements TaskService {

	List<Task> listTask = new ArrayList<Task>();
	
	@Autowired
	EmployeeManagementService employeeService;
	
	TaskServiceImpl(EmployeeManagementService es){
		this.employeeService = es;
	}
	
	
	@Override
	public void addTask(Task t) {
		
		for(Employee e : t.getListEmployees()){
			employeeService.addEmployee(e);
		}
		
		listTask.add(t);
		
	}


	@Override
	public String showTasks() {
		StringBuilder sb = new StringBuilder();
		
		for(Task t : listTask){
			sb.append(t.toString()).append("\n");
		}
		
		return sb.toString();
	}

}
