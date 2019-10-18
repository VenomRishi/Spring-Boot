/******************************************************************************
 *  Purpose: Interface which can be implemented later for Student Service
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   17-10-2019
 *
 ******************************************************************************/

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
