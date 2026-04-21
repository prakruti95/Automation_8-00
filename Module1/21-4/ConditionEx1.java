package com.a214;

import java.util.Scanner;

public class ConditionEx1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Marks");
		int marks = sc.nextInt();
		
		
		if(marks>=35)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
}
