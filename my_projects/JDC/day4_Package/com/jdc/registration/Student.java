package com.jdc.registration;

import com.jdc.teaching.Course;

public class Student{
	String name;
	com.jdc.teaching.Course course;

	public Strudent(String name){
		this.name = name;
	}

	public void takeCourse(com.jdc.teaching.Course c){
		course = c;
	}

	public void sayYourCourse(){

		System.out.println("My name is " + name);
		System.out.println("I take this " + course.name);

	}


}