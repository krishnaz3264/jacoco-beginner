package org.jacoco.beginner.integration;

import org.jacoco.beginner.impl.Student;
import org.jacoco.beginner.ws.StudentFacade;
import org.junit.Assert;
import org.junit.Test;

public class StudentFacadeTest {

	private StudentFacade facade = new StudentFacade();

	@Test
	public void test() {
		Student student = facade.getStudent();
		Assert.assertNotNull(student);
	}
}
