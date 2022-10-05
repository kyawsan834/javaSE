package com.jdc.teaching;

public class Lesson{

	private String name;
	private Course course;

	public Lesson(String name, Course course){
		this.name = name;
		this.course = course;
	}

	public void showInfor(){
		System.out.println("This is " + name + " Lesson from " + course.name);
	}

}