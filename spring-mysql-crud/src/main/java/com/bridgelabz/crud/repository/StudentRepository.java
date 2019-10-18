/******************************************************************************
 *  Purpose: this interface is repository interface which can give service
 *  		 to use the implementation of JpaRepository this is the class
 *  		 which we are extending in this interface
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   17-10-2019
 *
 ******************************************************************************/


package com.bridgelabz.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.bridgelabz.crud.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
