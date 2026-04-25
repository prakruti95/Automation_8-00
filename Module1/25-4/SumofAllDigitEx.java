package com.a254;

import java.util.Scanner;

public class SumofAllDigitEx 
{
	public static void main(String[] args)
	{
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num = sc.nextInt();//1234
		
		
		while(num>0)
		{
			int rem = num%10;
			sum+=rem;
			num=num/10;
			
		}
		
		System.out.println("Sum of all digits are : "+sum);
	}
}
