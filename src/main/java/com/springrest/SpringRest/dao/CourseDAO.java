package com.springrest.SpringRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.SpringRest.entity.Course;

public interface CourseDAO extends JpaRepository<Course, Integer>{

}
