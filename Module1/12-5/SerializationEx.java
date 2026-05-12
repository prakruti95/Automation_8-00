package com.a125;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx 
{
	public static void main(String[] args) throws IOException 
	{
		
		Student s1 = new Student(101,"akshay");
		FileOutputStream fout = new FileOutputStream("E://tops.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s1);
		System.out.println("success");
	}
}
