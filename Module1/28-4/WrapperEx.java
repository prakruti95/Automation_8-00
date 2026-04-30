package com.a284;

import java.util.Scanner;

public class WrapperEx 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Value For A: ");
		String a = sc.next();
		
		System.out.println("Enter Value For B: ");
		String b = sc.next();
		
		int c = Integer.parseInt(a)+Integer.parseInt(b);
		System.out.println(c);
		
		
		
		
	}
}
