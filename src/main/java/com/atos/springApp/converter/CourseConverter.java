package com.atos.springApp.converter;

import org.springframework.stereotype.Component;

import com.atos.springApp.entity.Course;
import com.atos.springApp.model.CourseModel;

@Component("courseConverter")
public class CourseConverter {

	public CourseModel entity2model (Course course) {
		CourseModel courseModel = new CourseModel();
		courseModel.setName(course.getName());
		courseModel.setDescription(course.getDescription());
		courseModel.setPrice(course.getPrice());;
		courseModel.setHours(course.getHours());;
		return courseModel;
	}

	public Course model2entity (CourseModel courseModel) {
		Course course = new Course();
		course.setName(courseModel.getName());
		course.setDescription(courseModel.getDescription());
		course.setPrice(courseModel.getPrice());
		course.setHours(courseModel.getHours());
		return course;
	}
}
