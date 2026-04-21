package com.a214;

import java.util.Scanner;

public class ConditionEx8 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your num");
		int num = sc.nextInt();
		
		switch(num)
		{
			case 1:System.out.println("English");
			break;
			case 2:System.out.println("Hindi");
			break;
			case 3:System.out.println("Gujarati");
			break;
			
			default:System.out.println("Please Enter Valid Number");
			break;
		}
		
	}
}
