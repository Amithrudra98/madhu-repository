package com.te.practice.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Sort {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		set.add(new Student(101, "Vishwas", 80, 21));
		set.add(new Student(105, "Jashwanth", 90, 23));
		set.add(new Student(104, "Amith", 75, 22));
		set.add(new Student(102, "Madhu", 95, 25));
		set.add(new Student(103, "Bala", 65, 26));
		List<Student> sList = new ArrayList<Student>(set);
		Scanner userInput = new Scanner(System.in);
		
do {
	
		System.out.println("1.Sort By Id");
		System.out.println("2.Sort By Name");
		System.out.println("3.Sort By Percentage");
		System.out.println("4.Sort By age");
		System.out.println("5.Exit");
		int value = userInput.nextInt();

		switch (value) {
		case 1:
			Collections.sort(sList, new SortById());
			for (Student student : sList) {
				System.out.println(student);
			}
			break;

		case 2:
			Collections.sort(sList, new SortByName());
			for (Student student : sList) {
				System.out.println(student);
			}
			break;
			
		case 3:
			Collections.sort(sList, new SortByPercentage());
			for (Student student : sList) {
				System.out.println(student);
			}
			break;
			
		case 4:
			Collections.sort(sList, new SortByAge());
			for (Student student : sList) {
				System.out.println(student);
			}
			break;
		}
		System.out.println(" ");
		System.out.println("Would you like to sort using anyother method press 1 or to EXIT press 5");
		int x=userInput.nextInt();
		
		if(x==5)
			break;
}while(true);
	}
}
