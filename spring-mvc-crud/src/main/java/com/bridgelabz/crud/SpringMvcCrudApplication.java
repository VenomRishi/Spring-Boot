/******************************************************************************
 *  Purpose: Class is implemented to tell the spring boot application this is
 *  		 the starting point of application @SpringBootApplication annotation
 *  		 will tell the application of starting point
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   18-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMvcCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcCrudApplication.class, args);
	}

}
