package com.curso.spring.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.curso.spring.model.Person;
import com.curso.spring.service.ExampleService;

@Service("/exampleService")
public class ExampleServiceImpl implements ExampleService {

	private static final Log LOGGER =LogFactory.getLog(ExampleServiceImpl.class);
	
	@Override
	public List<Person> getListPeople() {
		List<Person> people = new ArrayList<>();
		people.add(new Person ("Oscar",15));
		people.add(new Person ("Juan",20));
		people.add(new Person ("Oscar",25));
		people.add(new Person ("Alan",30));
		people.add(new Person ("Rosa",35));
		people.add(new Person ("Ana",40));
		LOGGER.info("Entre a un servicio");
		return people;
	}

}
