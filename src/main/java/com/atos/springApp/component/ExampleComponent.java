package com.atos.springApp.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.atos.springApp.repository.CourseJpaRepository;

@Component
public class ExampleComponent {

	private static final Log LOG = LogFactory.getLog(ExampleComponent.class);
	
	@Autowired
	@Qualifier("courseJpaRepository")
	private CourseJpaRepository CourseJpaRepository;
	
	public void sayHello() {
		
		LOG.info("HELLO FROM EXAMPLECOMPONENT");
	}

}
