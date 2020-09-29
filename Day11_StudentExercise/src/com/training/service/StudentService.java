package com.training.service;

import java.util.ArrayList;
import java.util.List;

import com.training.entity.MarkList;
import com.training.entity.Student;

public class StudentService {

	List<Student> students;
	
	public StudentService() {
		super();

		this.students = new ArrayList<Student>();
		students.add(new Student(101, "Ramesh", new MarkList(95, 69, 89)));
		students.add(new Student(102, "Suresh", new MarkList(56, 47, 65)));
		students.add(new Student(103, "Rajesh", new MarkList(90, 56, 78)));
		students.add(new Student(104, "Mukesh", new MarkList(67, 65, 76)));
		students.add(new Student(105, "Rakesh", new MarkList(58, 36, 87)));
	}
	
	public StudentService(List<Student> students) {
		super();
		this.students = students;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public MarkList getDetails(String studentName) {
		List<Student> students = getStudents();
		for(int i=0; i<students.size(); i++) {
			if(students.get(i).getStudentName().equals(studentName)) {
				return students.get(i).getMarks();
			}
		}
		return null;
	}
}
