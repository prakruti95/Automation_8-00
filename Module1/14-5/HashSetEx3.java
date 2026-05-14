package com.a145;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetEx3 
{
	public static void main(String[] args)
	{
		HashSet l1 = new HashSet();
		
		l1.add("A");
		l1.add("P");
		l1.add("C");
		l1.add("Z");
		l1.add("X");
		l1.add("Q");
		l1.add("B");
		l1.add("Y");
		
		int setHashValue = l1.hashCode();
		System.out.println(setHashValue);
//		Iterator i = l1.iterator();
//		
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
	}
}
