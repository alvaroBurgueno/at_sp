package com.atos.springApp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.atos.springApp.model.Person;
import com.atos.springApp.service.ExampleService;
@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {

	private static final Log LOG = LogFactory.getLog(ExampleServiceImpl.class);
	
	@Override
	public List<Person> getListPeople() {
		List<Person> people = new ArrayList<>();
		people.add(new Person("John Snow", 35));
		people.add(new Person("Daenerys Targeryen", 19));
		people.add(new Person("Tyrion Lannister", 43));
		people.add(new Person("Ned Stark", 56));
		people.add(new Person("El Matagigantes", 18));
		LOG.info("HELLO FROM SERVICE");
		return people;
	}

}
