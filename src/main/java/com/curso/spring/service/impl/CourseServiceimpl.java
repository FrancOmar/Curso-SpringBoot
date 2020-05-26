package com.curso.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.curso.spring.entity.Course;
import com.curso.spring.repository.CourseJpaRepository;
import com.curso.spring.service.CourseService;

public class CourseServiceimpl implements CourseService {
	
	@Autowired
	@Qualifier("courseRepository")
	private CourseJpaRepository courseJpaRepository;
	
	
	@Override
	public List<Course> listAllCourses() {
		return courseJpaRepository.findAll();
	}

	@Override
	public Course addCourse(Course course) {
		return courseJpaRepository.save(course);
	}

	@Override
	public int removeCourse(int id) {
		//courseJpaRepository.delete(id);
		return 0; 
	}

	@Override
	public Course updateCourse(Course course) {
		return courseJpaRepository.save(course);
	}

}
