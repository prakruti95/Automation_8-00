package com.a25;

class M
{
	int m1 = 2;
}
class N extends M
{
	int n1 = 3;
}
interface J 
{
	int j1=4;
}
class K extends N implements J
{
	int k1=5;
	
	void mul()
	{
		int ans = k1*j1*n1*m1;
		System.out.println(ans);
	}
}

public class CoutingEx2 
{
	public static void main(String[] args) 
	{
		K k1 = new K();
		k1.mul();
	}
}
