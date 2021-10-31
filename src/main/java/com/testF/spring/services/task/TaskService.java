package com.testF.spring.services.task;

import com.testF.spring.domain.Task;

public interface TaskService {

	public void addTask(Task t);
	public String showTasks();
}
