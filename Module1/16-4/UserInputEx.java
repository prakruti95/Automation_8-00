package com.a164;

import java.util.Scanner;

public class UserInputEx 
{
	public static void main(String[] args) 
	{
		//classname objname = new classname();
		Scanner sc = new Scanner(System.in);//object
		
		System.out.println("Enter Your Name");
		String name = sc.next();
		
		System.out.println("Enter Your Salary");
		int salary = sc.nextInt();
		
		System.out.println("Enter Your City");
		String city = sc.next();
		
		System.out.println(name+" "+salary+" "+city);
	}
}
