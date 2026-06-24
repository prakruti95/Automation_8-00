package org.junit1.JUnitEx;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Ex1 
{
	 @Test
	   public void testAdd() {
	      //test data
	      int num= 5;
	      String str= "Abc";

	      //check for equality
	      assertEquals("Abc", str);
	      assertTrue(num > 6);
	      assertNotNull(str);
	    }
	 
//		 @Test
//		 public void testAdd2() 
//		 {
//			  int num= 5;
//			  
//		 }
//		 
//		 @Test
//		 public void testAdd3() 
//		 {
//			 String str= "Abc"; 
//			 
//		 }
	}

