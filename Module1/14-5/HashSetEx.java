package com.a145;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetEx 
{
	public static void main(String[] args)
	{
		HashSet l1 = new HashSet();
		
		l1.add("Java");
		l1.add("Php");
		l1.add("Flutter");
		l1.add("AI");
		l1.add("Pritesh");
		l1.add("DM");
		l1.add("GD");
		l1.add("Testing");
		l1.add("Java");
		l1.add("Krunal");
		
		HashSet l2 = new HashSet();
		
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
