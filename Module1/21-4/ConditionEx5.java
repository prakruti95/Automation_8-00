package com.a214;

import java.util.Scanner;

public class ConditionEx5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Marks");
		int marks = sc.nextInt();//56
		
		if(marks>=70)
		{
			System.out.println("A Grade");
		}
		if(marks>=60)
		{
			System.out.println("B Grade");
		}
		if(marks>=50)
		{
			System.out.println("C Grade");
		}
		if(marks>=40)
		{
			System.out.println("D Grade");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		
	}
}
