package com.a55;

public class ArrayEx4 
{
	public static void main(String[] args)
	{
		
		int mydata[] = {1,2,3,4,5};
		int mydata2[] = new int[10];
		
		System.arraycopy(mydata, 2, mydata2, 4, 3);
		
		for(int i=0;i<10;i++)
		{
			System.out.println(mydata2[i]);
		}
			
	}
}
