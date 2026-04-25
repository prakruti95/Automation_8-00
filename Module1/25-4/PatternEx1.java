package com.a254;

public class PatternEx1 
{
	public static void main(String[] args) 
	{
		int num;//2
		
		for(int i=1;i<=4;i++)
		{
			num = i*2;//2
			for(int j=1;j<=i;j++)
			{
				System.out.print(num);
			}
			System.out.println();
		}
	}
}
