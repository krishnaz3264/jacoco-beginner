package org.jacoco.beginner.ws;

import org.jacoco.beginner.impl.Student;
import org.jacoco.beginner.impl.StudentService;

public class StudentFacade {
	
	private StudentService service = new StudentService();

	public Student getStudent() {
		
		return service.getStudent();
	}
}
