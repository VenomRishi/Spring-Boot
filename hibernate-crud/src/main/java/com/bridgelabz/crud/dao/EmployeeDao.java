package com.bridgelabz.crud.dao;

import java.util.List;

import com.bridgelabz.crud.model.Employee;

public interface EmployeeDao {
	List<Employee> get();

	Employee get(int id);

	void save(Employee employee);

	void delete(int id);
}
