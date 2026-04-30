package com.a304;

public class ConEx2 
{
	static int count = 0;
	ConEx2()
	{
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) 
	{
		ConEx2 c1 = new ConEx2();
		ConEx2 c2 = new ConEx2();
		ConEx2 c3 = new ConEx2();
	}
}
