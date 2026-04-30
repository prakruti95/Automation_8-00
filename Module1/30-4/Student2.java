package com.a304;

//class
public class Student2 
{
	//data member
	String name;
	String tech;
	int fees;
	
	void display()
	{
		System.out.println(name+" "+tech+" "+fees);
	}
	
	public static void main(String[] args)
	{
	  
		Student2 s1 = new Student2();
		Student2 s2 = new Student2();
		Student2 s3 = new Student2();
		
		//value assign
		s1.name="a";
		s1.tech="a1";
		s1.fees=100;
		
		s2.name="a";
		s2.tech="a1";
		s2.fees=100;
		
		s3.name="a";
		s3.tech="a1";
		s3.fees=100;
		
		//value print
		
		s1.display();
		s2.display();
		s3.display();
		
	}
}
