package com.a164;

public class SimpleIntrestEx 
{
	public static void main(String[] args)
	{
		int amount = 50000;
		float roi = 7.8F;
		int year = 3;
		
		float ans = amount*roi*year/100;
		//System.out.println(ans);
		float fa = amount+ans;
		System.out.println(fa);
	}
}
