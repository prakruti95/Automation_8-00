package com.a25;

public class ThisKeywordEx 
{
	int id;
	String name;
	
	public ThisKeywordEx(int id,String name) 
	{
		this.id = id;
		this.name = name;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args)
	{
		ThisKeywordEx p1 = new ThisKeywordEx(101,"a");
		ThisKeywordEx p2 = new ThisKeywordEx(102,"b");
		
		p1.display();
		p2.display();
	}
}

