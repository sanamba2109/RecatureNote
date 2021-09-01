package com.revature.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.models.Course;

//this is a test suite (is grouping)
public class CourseTest {

	static Course c1;
	static Course c2;

	@BeforeClass
	public static void setUpbeforeClass() throws Exception {

		System.out.println("this run before all tests withing suite");
	}

	@AfterClass
	public static void afterClass() throws Exception {

		System.out.println("unning after all tests within test suite");
	}
@Before
public static void setU( ){
	System.out.println(" something to execute before each test");
		c1=new Course("Fisic");
		System.out.println("this run before a test");
	}
	
@After
public void tearDown() {
	
	System.out.println("Tearing down ....");
	c1=null;
	c2=null;
}


@Test
public void testGetName() {
	
	String expectedName = "English 101";
	
	String actualName = c1.getName();
	
	assertEquals(expectedName, actualName);
	
}


	@Test
	public void testSetName() 
	{
		String nameToSet=" cs 500";
		c1.setName(nameToSet);
		assertTrue(c1.getName().equals(nameToSet));

		System.out.println(" im a test");

	}
}
