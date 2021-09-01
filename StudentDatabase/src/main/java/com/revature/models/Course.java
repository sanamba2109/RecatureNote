package com.revature.models;

public class Course {
	String name;
 public static final double costOfcourse=600;
 
 
public Course(String name) {
	super();
	this.name = name;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public static double getCostofcourse() {
	return costOfcourse;
}


@Override
public String toString() {
	return "Course [name=" + name + "]";
}
 



}