package testng;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/*listeners is a interface in TESTNG 
when we are executing code internally some events are occured in testng
listeners is an interface  that is listening to the events performed by ths TESTNG.
if want to alter behaviour of testng  while performing any actions during execuiton then we have to use listeners.

Baased on the results of the testcases (fail,pass,skip) if we need to do post actions we will use listeners concept.
listener interface consist of pre defined methods (abstract methods) we have to integrate that with our testcases.
based on the testcase status we can do some acitons and that can be achieved by the listerners interface.

These are some of important listeners.

IAnnotationTransformer (to change any attibutes)
IAnnotationTransformer2
IHookable
IInvokeMethodListener
IReporter 
ISuitelistener
ITestListener.(most common listner interface)
*/

//@Listeners(testng.cusotmlisteners.class)
public class listeners {
  @Test
  public void test1() {
	  System.out.println("test1");
	 Assert.assertEquals("A", "A");
  }
  @Test
  public void test2() {
	  System.out.println("test2");
      Assert.assertNotEquals("A", "B");
  }
  @Test
	  public void tets3() {
		  System.out.println("test3");
		  throw new SkipException("This is skip Exception");
	  }
}
