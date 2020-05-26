package com.curso.spring.componet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.curso.spring.repository.CourseJpaRepository;

@Component("/exampleComponent")
public class ExampleComponent {
	
	private static Log LOG = LogFactory.getLog(ExampleComponent.class);
	
	@Autowired
	@Qualifier("courseRepository")
	private CourseJpaRepository courseJpaRepository;
	
	public void sayHello() {
		LOG.info("Hola soy un componenete");
	}
}
