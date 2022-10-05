package com.jdc;

import registration.*;
import teaching.*;

public class PackageTesting{

	public static void main(String[] args) {

		Course c = new Course("Java SE");
	
		Student student = new Student("Kyaw San");
		student.takeCourse(c);
   	

   		student.sayYourCourse();

	}

}