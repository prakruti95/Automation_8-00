package com.a145;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetEx2 
{
	public static void main(String[] args)
	{
		HashSet l1 = new HashSet();
		
		l1.add(101);
		l1.add(104);
		l1.add(105);
		l1.add(103);
		l1.add(102);
		
		Iterator i = l1.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
