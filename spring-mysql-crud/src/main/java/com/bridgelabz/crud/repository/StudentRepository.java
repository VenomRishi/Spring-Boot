package com.bridgelabz.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.bridgelabz.crud.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
