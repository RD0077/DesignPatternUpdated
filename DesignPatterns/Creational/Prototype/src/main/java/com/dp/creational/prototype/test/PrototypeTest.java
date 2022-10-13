package com.dp.creational.prototype.test;

import java.util.List;

import com.dp.creational.prototype.dao.StudentDAO;
import com.dp.creational.prototype.model.Student;

public class PrototypeTest {
	/*
	 * Prototype comes under a creational design pattern that makes use of cloning objects if object creation complex and time-consuming.
	 * prototype pattern provide a mechanism to copy the original object ot a new object and then modify it according to our need.
	 * Prototype design pattern uses the java cloning to copy the object.
	 */
public static void main(String[] args) throws CloneNotSupportedException  {
		
		StudentDAO studentDAO = new StudentDAO();
		
		//Getting Original copy of student list
		List<Student> allStudents = studentDAO.getAllStudents();
		
		//Getting clone copy of student list
		List<Student> updatedStudentList = studentDAO.clone();
		Student student = new Student();
		student.setId(30);
		student.setName("SK");
		
		//Doing manipulation on cloned copy
		updatedStudentList.add(student);
		
		System.out.println("Original Student List::");
		allStudents.forEach(System.out::println);
		
		System.out.println("Updated Student List::");
		updatedStudentList.forEach(System.out::println);
	}
}
