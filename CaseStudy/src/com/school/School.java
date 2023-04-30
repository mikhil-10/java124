package com.school;

class subject {
	int sub(int chapter, int covered) {
		System.out.println("remaining chapters ");
		return chapter - covered;
	}

	int sub(int chapter) {
		System.out.println("Total chapters");
		return chapter;
	}
}

class student extends subject {
	String name;
	int id;
	public student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
		System.out.println("Student name and id : ");
	}

	@Override
	int sub(int chapter) {
		// TODO Auto-generated method stub
		return super.sub(chapter);
	}

	@Override
	public String toString() {
		return "student [name=" + name + ", id=" + id + "]";
	}
}

class teacher extends subject {
	String name;
	int id;

	public teacher(String name, int id) {
		super();
		this.name = name;
		this.id = id;
		System.out.println("Teacher name and id: ");
	}
	@Override
	int sub(int chapter, int covered) {
		// TODO Auto-generated method stub
		return super.sub(chapter, covered);
	}
	@Override
	public String toString() {
		return "teacher [name=" + name + ", id=" + id + "]";
	}
}
public class School {
	public static void main(String[] args) {
		student s = new student("Student1 ",24);
		System.out.println(s);
		System.out.println(s.sub(20));
		teacher t = new teacher("Teacher1 ",110);
		System.out.println(t);
		System.out.println(t.sub(20, 3));
		
		
	}
}
