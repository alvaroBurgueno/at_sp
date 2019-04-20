package com.atos.springApp.service.impl;

import java.util.List;

import javax.persistence.Entity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.atos.springApp.controller.CourseController;
import com.atos.springApp.entity.Course;
import com.atos.springApp.repository.CourseJpaRepository;
import com.atos.springApp.service.CourseService;

@Service("courseServiceImpl")
public class CourseServiceImpl implements CourseService {

	private static final Log LOG = LogFactory.getLog(CourseServiceImpl.class);
	@Autowired
	@Qualifier("courseJpaRepository")
	
	private CourseJpaRepository courseJpaRepository;
	
	@Override
	public List<Course> listAllCourses() {
		LOG.info("Call: "+ "listAllCourses()");
		return courseJpaRepository.findAll();
	}

	@Override
	public Course addCourse(Course course) {
		LOG.info("Call: "+ "addCourse()");
		return courseJpaRepository.save(course);
	}

	@Override
	public int RemoveCourse(int id) {
		courseJpaRepository.deleteById(id);
		return 0;
	}

	@Override
	public Course updateCourse(Course course) {
		return courseJpaRepository.save(course);
	}

}
