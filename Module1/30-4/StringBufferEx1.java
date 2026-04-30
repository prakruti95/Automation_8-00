package com.a304;

//mutable
public class StringBufferEx1 
{
	public static void main(String[] args) 
	{
		StringBuffer sf = new StringBuffer("Hello");
		//sf.append("Java");
		//System.out.println(sf);
		//sf.insert(1,"Java");
		//sf.delete(1,3);
		//sf.reverse();
		sf.replace(1, 3, "Java");
		System.out.println(sf);
	}
}
