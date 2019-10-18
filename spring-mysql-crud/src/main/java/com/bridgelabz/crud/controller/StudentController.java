/******************************************************************************
 *  Purpose: Class is implemented for handling the request from the user
 *  		 @RestController defines that it will deal with the rest controller
 *  		 @RequestMapping will handle the request
 *  		 in this class handling request related topic
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   17-10-2019
 *
 ******************************************************************************/

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

import com.bridgelabz.crud.model.Student;
import com.bridgelabz.crud.service.StudentServiceImpl;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentServiceImpl studentServiceImpl;

	@GetMapping("/studs")
	public List<Student> getAllStudent() {
		return studentServiceImpl.getAllStudent();
	}

	@PostMapping("/studs")
	public Student addStudent(@RequestBody Student student) {
		return studentServiceImpl.addStudent(student);
	}

	@GetMapping("/studs/{id}")
	public Student getStudent(@PathVariable(value = "id") int id) {
		return studentServiceImpl.getStudent(id);
	}

	@PutMapping("/studs/{id}")
	public Student updateStudent(@PathVariable(value = "id") int id, @RequestBody Student student) {
		return studentServiceImpl.updateStudent(id, student);
	}

	@DeleteMapping("/studs/{id}")
	public String deleteStudent(@PathVariable(value = "id") int id) {
		return studentServiceImpl.deleteStudent(id);

	}

}
