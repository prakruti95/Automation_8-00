package com.a125;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerializationEx 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		
		ObjectInputStream oin = new ObjectInputStream(new FileInputStream("E://tops.txt"));
		Student s1 = (Student) oin.readObject();
		System.out.println(s1.name+" "+s1.num);
	}
}
