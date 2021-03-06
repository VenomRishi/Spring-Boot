package com.bridgelabz.crud.service;

import java.util.List;

import com.bridgelabz.crud.model.Employee;

public interface EmployeeService {
	List<Employee> get();

	Employee get(int id);

	void save(Employee employee);

	void delete(int id);
}
