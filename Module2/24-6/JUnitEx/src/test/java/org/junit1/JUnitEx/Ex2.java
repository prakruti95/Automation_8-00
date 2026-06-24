package org.junit1.JUnitEx;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;

public class Ex2 extends TestCase
{
	  protected double fValue1;
	  protected double fValue2;
	
	@Before
	public void setUp() 
	{
	     System.out.println("setup");
	      fValue1= 2.0;
	      fValue2= 3.0;
	}
	   
	@Test
	public void testadd()
	{
		  //count the number of test cases
	      System.out.println("No of Test Case = "+ this.countTestCases());
	    
	      //test getName 
	      String name= this.getName();
	      System.out.println("Test Case Name = "+ name);

	      //test setName
	      this.setName("testNewAdd");
	      String newName= this.getName();
	      System.out.println("Updated Test Case Name = "+ newName);
	      
	      assertEquals(5.0, fValue1+fValue2);
	}
	
	 public void tearDown() 
	 {
	     System.out.println("clean up.");
	 }
}
