package com.a55;

public class OverloadingEx 
{
	
	static int count(int a,int b)
	{
		return a+b;
	}
	static int count(int c,int d,int a)
	{
		return c*d*a;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(OverloadingEx.count(6,3,3));
		System.out.println(OverloadingEx.count(6,3));
		
	}
}
