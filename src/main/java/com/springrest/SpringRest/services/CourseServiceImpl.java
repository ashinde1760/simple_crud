package com.springrest.SpringRest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springrest.SpringRest.dao.CourseDAO;
import com.springrest.SpringRest.entity.Course;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseDAO courseDao;
	
	
	//All courses
	@Override
	public List<Course> getCourses() 
	{
		return courseDao.findAll();
	}

	//Get Perticular course by its Id
	@Override
	public Optional<Course> getCourse(int courseId)
	{
		Optional<Course> course=courseDao.findById(courseId);
		return course;
	}

	@Override
	public Course addCourse(Course course) 
	{
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) 
	{
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(int courseId) 
	{
		Course course=courseDao.getOne(courseId);
		courseDao.delete(course);
	}

}
