package com.a254;

import java.util.Scanner;

public class FirstandLastDigitEx 
{
	public static void main(String[] args) 
	{
		int ldigit=0;
		int fdigit=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num = sc.nextInt();//1234
		
		ldigit = num%10;//4
		
		while(num>0)
		{
			if(num>9)
			{
				num=num/10;//123,12,1
			}
			else
			{
				fdigit = num;//1
				num=num/10;
			}
		}
		
		int ans = fdigit+ldigit;
		System.out.println(ans);
		
	}
}
