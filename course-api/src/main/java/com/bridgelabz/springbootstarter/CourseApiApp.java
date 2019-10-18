/******************************************************************************
 *  Purpose: Class is implemented to tell the spring boot application this is
 *  		 the starting point of application @SpringBootApplication annotation
 *  		 will tell the application of starting point
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   16-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {
	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args);

	}
}
