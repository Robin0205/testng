 package practice;
/*
 *Testng is a testing framework for java programming language only it is a TD

 * testng is a testing framework which can be used for unit,integration,end to end ,functional testing 
 *it is inspired from J and N unit by introducing some new functionalities that make it more powerful and easier to use suh as 
 * annotations
 * supports for parameterozing the test cases using parameters annotation
 * parallel execution.
 * data provider.
 * test that ur code is a multi thread safe.
 * support for parameters
 * powerful execution mode 
 * supported by variety of tools(eclipse,idea ,maven)
 * depedndent methods for application server testing
 * j unit and N unit  are the testing framework for the for java and .net programming language
 * if a class consist of any one  test method  it is called test class
 * execution of methods in testng execute based on alphatical order of the method name.
 */

import org.testng.annotations.*;


public class intro {
	
	@Test(dependsOnMethods="test2",alwaysRun=true)
	public void test1() {
		
		System.out.println("this is test1");
		
		
	}
	
	@Test
	public void test2() throws Exception {
		System.out.println(5/0);
     
		System.out.println("this is test2");
		
	}
	
	
			
}
	
	
	
		
	



