package com.springrest.SpringRest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.SpringRest.entity.Course;
import com.springrest.SpringRest.services.CourseService;

@RestController
public class MyController {

	@Autowired
	private CourseService courseService;
	
	
	@GetMapping("/home")
	public String home()
	{
		return "this is home page";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return this.courseService.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Optional<Course> getCourse(@PathVariable int courseId)
	{
		return this.courseService.getCourse(courseId);
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseService.addCourse(course);
	}
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course)
	{
		return this.courseService.updateCourse(course);
	}
	
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable int courseId)
	{
		try 
		{
			this.courseService.deleteCourse(courseId);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) 
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
