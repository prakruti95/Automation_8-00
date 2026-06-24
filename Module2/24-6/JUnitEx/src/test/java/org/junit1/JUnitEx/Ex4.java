package org.junit1.JUnitEx;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Ex4 
{
	@Test(expected = ArithmeticException.class)
	  public void testPrintMessage() 
		{
	    int a = 0;
	    int b = 1 / a;
	    assertEquals(0,b);
	  }
}
