package com.a284;

//class
public class Student 
{
	//data member
	int id;
	String name;
	
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
		
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);
		System.out.println(s3.id+" "+s3.name);
		
		
	}
}
