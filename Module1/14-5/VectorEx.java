package com.a145;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector(5);
		
		v.addElement("java");
		v.addElement("java");
		v.addElement("java");
		v.addElement("java");
		v.addElement("java");
		v.addElement("java");
		v.addElement("java");
		v.addElement("java");
		v.addElement("java");
		v.addElement("java");
		v.addElement("java");
		System.out.println(v.contains("java"));
		//System.out.println(v.);
		System.out.println("Size: "+v.size());
		System.out.println("Capacity: "+v.capacity());
		
		System.out.println(v);
		
		Iterator i =v.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
