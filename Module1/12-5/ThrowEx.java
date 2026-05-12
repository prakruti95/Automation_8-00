package com.a125;

public class ThrowEx 
{
	
	static void validate(int age)
	{
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			throw new Error();
		}
	}
	
	
	
	public static void main(String[] args)
	{
		int age = 14;
		
		validate(age);
	}
}

