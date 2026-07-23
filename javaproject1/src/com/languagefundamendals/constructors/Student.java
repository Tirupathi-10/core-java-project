package com.languagefundamendals.constructors;

public class Student {
	int id;
	String Name;
	String course;
	Student(){
		this(1);
	}
	

	public Student(int id) {
	this(id,"Tiru");
	}
	
	public Student(int id, String Name) {
		this(id,Name,"Java Full Stack");
	}


	public Student(int id, String Name, String course) {

		this.id = id;
		this.Name = Name;
		this.course = course;
	}


	public static void main(String[] args) {
		Student s= new Student();
		s.show();
	}
	void show() {
		System.out.println("Name of the Student  :"+Name);
		System.out.println("ID of the Student    :"+id);
		System.out.println("Course of the Student:"+course);

	}

}
