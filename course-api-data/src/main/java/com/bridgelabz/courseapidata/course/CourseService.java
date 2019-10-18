/******************************************************************************
 *  Purpose: Class is implemented for handling the service the controller
 *  		 @Service annotation defines this class is service class
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   17-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.courseapidata.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(String topicId) {
		List<Course> topics = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(topics::add);
		return topics;
	}

	public Course getCourse(String id) {
		return courseRepository.findById(id).orElse(null);

	}

	public void addCourse(Course course) {
		courseRepository.save(course);

	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
}
