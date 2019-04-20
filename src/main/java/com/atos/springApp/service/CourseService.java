package com.atos.springApp.service;

import java.util.List;

import com.atos.springApp.entity.Course;

public interface CourseService {

	public abstract List<Course> listAllCourses();
	public abstract Course addCourse(Course course);
	public abstract int RemoveCourse(int id);
	public abstract Course updateCourse(Course course);
}
