package com.bridgelabz.crud.service;

import java.util.List;

import com.bridgelabz.crud.model.Student;

public interface StudentService {
	public List<Student> getAllStudent();
	public Student addStudent(Student student);
	public Student getStudent(int id);
	public Student updateStudent(int id, Student student);
	public String deleteStudent(int id);
}
