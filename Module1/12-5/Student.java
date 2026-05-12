package com.a125;

import java.io.Serializable;

public class Student implements Serializable
{
	int num;
	String name;
	
	public Student(int num,String name)
	{
		this.num=num;
		this.name=name;
	}
}
