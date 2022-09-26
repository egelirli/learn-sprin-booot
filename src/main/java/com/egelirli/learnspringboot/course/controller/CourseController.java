package com.egelirli.learnspringboot.course.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.egelirli.learnspringboot.course.bean.Course;

@RestController
public class CourseController {

		@GetMapping("/courses")
		public List<Course> getAllCourses(){
			return Arrays.asList(new Course(1, "Learn SpringBoot", "In28Minutes"),
									new Course(2, "Learn Docker", "In28Minutes"));
			
		}

		@GetMapping("/courses/1")
		public Course getCourseDetail(){
			return new Course(1, "Learn SpringBoot", "In28Minutes");
			
		}

}


