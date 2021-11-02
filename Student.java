package com.te.practice.assignment;

public class Student {
	int id;
	String name;
	double percentage;
	int age;

	public Student(int id, String name, double percentage, int age) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		this.age = age;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", percentage=" + percentage + ", age=" + age + "]";
	}
	
	
}
