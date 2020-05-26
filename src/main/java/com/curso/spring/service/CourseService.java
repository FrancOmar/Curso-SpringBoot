package com.curso.spring.service;

import java.util.List;

import com.curso.spring.entity.Course;

public interface CourseService {
	
	//Get- CREATE.READ.UPDATE.DELETE
	public abstract List<Course> listAllCourses();
	
	//POST-Crear nuevo curso
	public abstract Course addCourse(Course course);
	
	//DELETE- Eliminar atraves de un ID
	public abstract int removeCourse(int id);
	
	//UPDATE Actualizar un course
	public abstract Course updateCourse(Course course);
	
}
