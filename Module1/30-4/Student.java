package com.a304;

//class
public class Student 
{
	//data member
	int id;
	String name;
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args)
	{
	  //classname objname = new classname();
	   //objects
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		//value assign
		s1.id=101;
		s1.name="test";
		
		s2.id=102;
		s2.name="test2";
		
		s3.id=103;
		s3.name="test3";
		
		//value print
		
		s1.display();
		s2.display();
		s3.display();
		
	}
}
