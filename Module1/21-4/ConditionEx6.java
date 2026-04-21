package com.a214;

import java.util.Scanner;

public class ConditionEx6 
{
	public static void main(String[] args) 
	{
		String myemail="a@gmail.com";
		String mypass="1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Email");
		String email = sc.next();
		System.out.println("Enter Your Password");
		String pass = sc.next();
		
		if(email.equals(myemail))
		{
			System.out.println("Email is Correct");
		}
		if(pass.equals(mypass))
		{
			System.out.println("Password is Correct");
		}
		
		
		
	}
}
