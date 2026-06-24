package org.junit1.JUnitEx;
import org.junit.Test;
import junit.framework.AssertionFailedError;
import junit.framework.TestResult;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Ex3 extends TestResult 
{
   // add the error
   public synchronized void addError(Test test, Throwable t) {
      super.addError((junit.framework.Test) test, t);
   }
   // add the failure
   public synchronized void addFailure(Test test, AssertionFailedError t) {
      super.addFailure((junit.framework.Test) test, t);
   }
   @Test
   public void testAdd() 
   {
   // add any test
   }   
   // Marks that the test run should stop.
   public synchronized void stop() 
   {
      System.out.println("stop the test here");
   }
}


