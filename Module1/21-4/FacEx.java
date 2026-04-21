package com.a214;

import java.util.Scanner;

public class FacEx 
{
	public static void main(String[] args) 
	{
		int i,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int num = sc.nextInt();//5
		
		for(i=1;i<=num;i++)
		{
			
			fact = fact*i;//1//2//6//24//120
		}
		
		System.out.println(fact);
	}
}
