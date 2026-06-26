package org.unit.MyTestngEx;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class Abcd2 
{
	@Test(priority = 3)
	public void krunal()
	{
		assertFalse(true);
	}
	@Test(priority = 2)
	public void pritesh()
	{
		System.out.println("p");
	}
	@Test(priority = 1)
	public void vivek()
	{
		System.out.println("v");
	}
	
	@Test(priority = 4)
	public void naman()
	{
		System.out.println("n");
	}
}
