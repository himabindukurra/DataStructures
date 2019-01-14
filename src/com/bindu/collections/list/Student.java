package com.bindu.collections.list;

import java.util.Comparator;

public class Student implements Comparable{
	
	int id;
	String sname;
	int age;
	
	public Student(int id, String sname, int age) {
		// TODO Auto-generated constructor stub
		this.id = id;
        this.sname = sname;
        this.age = age;
		
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		int compareId = ((Student) o).getId();
		return this.id-compareId;
	
	}
	
	 public static Comparator<Student> StuNameComparator = new Comparator<Student>() {

			public int compare(Student s1, Student s2) {
			   String StudentName1 = s1.getSname().toUpperCase();
			   String StudentName2 = s2.getSname().toUpperCase();

			   //ascending order
			   return StudentName1.compareTo(StudentName2);

			   //descending order
			   //return StudentName2.compareTo(StudentName1);
		    }};

		    /*Comparator for sorting the list by roll no*/
		    public static Comparator<Student> StuRollno = new Comparator<Student>() {

			public int compare(Student s1, Student s2) {

			   int rollno1 = s1.getId();
			   int rollno2 = s2.getId();

			   /*For ascending order*/
			   return rollno1-rollno2;

			   /*For descending order*/
			   //rollno2-rollno1;
		   }};
		
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", age=" + age + "]";
	}


	protected int getRollno() {
		// TODO Auto-generated method stub
		return 0;
	}

}