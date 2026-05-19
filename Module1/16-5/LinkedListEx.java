package com.a165;

import java.util.Iterator;
import java.util.LinkedList;

//Singly & Doubly LinkedList

public class LinkedListEx 
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add("krunal");
		list.add("arun");
		list.addLast("Ankita");
		list.addFirst("Pritesh");
		
		System.out.println(list);
		
		Iterator i = list.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
