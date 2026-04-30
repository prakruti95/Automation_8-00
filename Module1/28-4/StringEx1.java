package com.a284;

public class StringEx1 
{
	public static void main(String[] args) 
	{
		String s1= "sachin";//literal string
		
		String s2 = new String("sachin"); //new keyword string
		
		char ch[]= {'s','a','c','h','i','n'};
		String s3 = new String(ch);//character array string
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
