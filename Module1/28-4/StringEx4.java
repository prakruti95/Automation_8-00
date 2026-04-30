package com.a284;

//string is a immutable
public class StringEx4 
{
	public static void main(String[] args) 
	{
		String s1= "  sachin  ";
		String s2 = "sachin";
		String s3 = "php is a programming language,php is a secure language ,php is a platform";
		
		System.out.println(s1.trim());
		System.out.println(s2.charAt(0));
		//System.out.println(s2.lastIndexOf(0));
		System.out.println(s2.startsWith("sa"));
		System.out.println(s2.endsWith("n"));
		
		System.out.println(s3.replace("php","Java"));
		
	}
}
