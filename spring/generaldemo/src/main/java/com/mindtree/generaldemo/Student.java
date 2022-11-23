package com.mindtree.generaldemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {
	private Teacher tea; // byType
	public Student(Teacher tea) {
		super();
		this.tea = tea;
	}
	void getNotes() {
		String mathNote = tea.notes();
		System.out.println(mathNote);
	}
	public static void main(String[] args) {
		ApplicationContext ac=
				new ClassPathXmlApplicationContext("springbeanconfiguration.xml");
		Student s=ac.getBean(Student.class);
		s.getNotes();
		
	}
	
}
