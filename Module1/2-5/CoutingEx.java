package com.a25;

class Shape
{
	int a1;
	int b1;
	
	void getdata(int a,int b)
	{
		a1 = a;
		b1 = b;
	}
}
class Rec extends Shape
{
	void rec()
	{
		int ans = a1*b1;
		System.out.println("Area of Rectangle is "+ans);
	}
}
class Tri extends Shape
{
	void tri()
	{
		double ans = 0.5*a1*b1;
		System.out.println("Area of Triangle is "+ans);
	}
}

public class CoutingEx 
{
	public static void main(String[] args) 
	{
		Rec r = new Rec();
		r.getdata(6,3);
		Tri t = new Tri();
		t.getdata(3,3);
		r.rec();
		t.tri();
	}
}
