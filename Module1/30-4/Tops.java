package com.a304;

public class Tops 
{
	int id;
	String name;
	Tops(Tops t1) 
	{
		System.out.println(t1.id+" "+t1.name);
	}
	Tops()
	{
		
	}
	void display()
	{
		
	}
	public static void main(String[] args)
	{
		Tops t1 = new Tops();
		t1.id=101;
		t1.name="abcd";
		
		Tops t2 = new Tops(t1);
	}
}
