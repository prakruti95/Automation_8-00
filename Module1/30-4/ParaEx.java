package com.a304;

public class ParaEx 
{
	int id;
	String name;
	
	public ParaEx(int i,String n) 
	{
		id = i;
		name = n;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args)
	{
		ParaEx p1 = new ParaEx(101,"a");
		ParaEx p2 = new ParaEx(102,"b");
		
		p1.display();
		p2.display();
	}
}

