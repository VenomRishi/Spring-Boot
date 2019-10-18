package com.bridgelabz.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.crud.model.Employee;
import com.bridgelabz.crud.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/emp")
	public List<Employee> get() {
		return employeeService.get();
	}

	@PostMapping("/emp")
	public Employee save(@RequestBody Employee employee) {
		employeeService.save(employee);
		return employee;
	}

	@GetMapping("/emp/{id}")
	public Employee get(@PathVariable(name = "id") int id) {
		return employeeService.get(id);
	}

	@DeleteMapping("/emp/{id}")
	public String Delete(@PathVariable(name = "id") int id) {
		employeeService.delete(id);
		return "Employee Deleted";
	}

	@PutMapping("/emp")
	public Employee update(@RequestBody Employee employee) {
		employeeService.save(employee);
		return employee;
	}
}
