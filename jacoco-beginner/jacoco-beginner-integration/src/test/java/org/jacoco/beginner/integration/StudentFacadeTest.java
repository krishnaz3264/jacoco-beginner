package org.jacoco.beginner.integration;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.jacoco.beginner.impl.Student;
import org.jacoco.beginner.ws.StudentFacade;
import org.junit.Assert;
import org.junit.Test;

public class StudentFacadeTest extends JerseyTest {

	@Override
	protected Application configure() {
		return new ResourceConfig();
	}

	private StudentFacade facade = new StudentFacade();

	@Test
	public void test() {
		Student student = facade.getStudent();
		Assert.assertNotNull(student);
	}
}
