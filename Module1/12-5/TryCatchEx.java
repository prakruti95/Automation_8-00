package com.a125;

public class TryCatchEx 
{
	public static void main(String[] args) 
	{
		
		try
		{
			int data = 10/0;
			System.out.println(data);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//finally block will execute compulsory
		finally 
		{
			System.out.println("success");
		}
		
		
	}
}
