package com.a145;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx 
{
	public static void main(String[] args)
	{
		LinkedHashSet l1 = new LinkedHashSet();
		
		l1.add("Java");
		l1.add("Php");
		l1.add("Flutter");
		l1.add("Testing");
		l1.add("Java");
		
		LinkedHashSet l2 = new LinkedHashSet();
		
		l2.add("Java");
		l2.add("Php");
		
		l1.addAll(l2);
		
		
		Iterator i = l1.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
