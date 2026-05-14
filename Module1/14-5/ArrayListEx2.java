package com.a145;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 
{
	public static void main(String[] args) 
	{
		
		ArrayList al = new ArrayList();
		
		al.add("Java");
		al.add("Php");
		al.add("Flutter");
		al.add("Testing");
		al.add("Java");
		
		ArrayList al2 = new ArrayList();
		al2.add("Gd");
		al2.add("Dm");
		al2.add("AI");
		al2.add("Php");
		
		
		//al.addAll(al2);
		//al.remove(2);
		//al.remove("Testing");
		//al.removeAll(al2);
		al.retainAll(al2);
		
		System.out.println(al);
	}
}
