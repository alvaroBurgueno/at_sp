package com.atos.springApp.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atos.springApp.entity.Course;

@Repository
public interface CourseJpaRepository extends JpaRepository<Course, Serializable> {

	// automáticamente genera el sql
	public abstract Course findByPrice(int price);
}
