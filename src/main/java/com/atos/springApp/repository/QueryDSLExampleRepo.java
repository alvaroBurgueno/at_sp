package com.atos.springApp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.query.criteria.internal.predicate.ExistsPredicate;
import org.springframework.stereotype.Repository;

import com.atos.springApp.entity.Course;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQuery;

@Repository("queryDSLExampleRepo")
public class QueryDSLExampleRepo {

	@PersistenceContext
	private EntityManager em;
	// mvn eclipse:eclipse  --> por si no reconoce la siguiente línea
	private QCourse qCourse = QCourse.course;
	
	public find(boolean exists) {
		JPAQuery<Course> query = new JPAQuery<Course>(em);
		
		Course course = query.select(qCourse).from(qCourse).where(qCourse.id.eq(23)).fetchOne();
		
		BooleanBuilder predicateBuilder = new BooleanBuilder(qCourse.description.endsWith("op"));
		
		if (exists) {
			Predicate predicate1 = qCourse.id.eq(23);
			predicateBuilder.and(predicate1);
		} else {
			Predicate predicate2 = qCourse.name.endsWith("op");
		}
		
		return query.select(qCourse).from(qCourse).where(predicateBuilder).fetchOne() ;
		
		//List<Course> courses = (List<Course>) query.select(qCourse).from(qCourse).where(qCourse.hours.between(10, 50));
	}
}
