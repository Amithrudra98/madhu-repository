package com.te.practice.assignment;

import java.util.Comparator;

public class SortByPercentage implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return (int) (o1.percentage - o2.percentage);
	}

}
