package com.a25;

class P
{
	void p()
	{
		System.out.println("P called");
	}
}
class Q extends P
{
	void q()
	{
		System.out.println("Q called");
	}
}
interface R 
{
	void r();
	
}
class S extends Q implements R
{

	@Override
	public void r() 
	{
		System.out.println("R Called");
		
	}
	void s()
	{
		System.out.println("S called");
	}
}


public class HybridEx
{
	public static void main(String[] args) 
	{
		S s1 = new S();
		s1.p();
		s1.q();
		s1.r();
		s1.s();
	}
}
