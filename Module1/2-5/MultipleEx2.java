package com.a25;

interface A2
{
	void a2();
}
interface B2
{
	void b2();
}
interface D2
{
	void d2();
}
class C2 implements A2,B2,D2
{

	@Override
	public void d2() {
	
		System.out.println("D2 called");
		
	}

	@Override
	public void b2() {

		System.out.println("B2 called");
	}

	@Override
	public void a2() {

		System.out.println("A2 called");
	}
	
}
public class MultipleEx2 
{
	public static void main(String[] args) 
	{
		C2 c = new C2();
		c.a2();
		c.b2();
		c.d2();
	}
}
