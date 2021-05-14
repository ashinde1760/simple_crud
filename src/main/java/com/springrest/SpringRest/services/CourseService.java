package com.springrest.SpringRest.services;

import java.util.List;
import java.util.Optional;

import com.springrest.SpringRest.entity.Course;

public interface CourseService {

	public List<Course> getCourses();

	public Optional<Course> getCourse(int courseId);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public void deleteCourse(int courseId);
}
