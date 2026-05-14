package com.a145;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx 
{
	public static void main(String[] args) 
	{
		
		ArrayList al = new ArrayList();
		
		al.add("Java");
		al.add("Php");
		al.add("Java");
		al.add("Php");
		al.add("Java");
		al.add("Php");
		al.add("Flutter");
		al.add("Testing");
		al.add(101);
		
		System.out.println(al);
		System.out.println("-------------------");
		System.out.println(al.get(1));
		System.out.println("-------------------");
		
		try
		{
			//Iterator<String> i = al.iterator();
			Iterator i = al.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("-------------------");
		
		
		
	}
}
