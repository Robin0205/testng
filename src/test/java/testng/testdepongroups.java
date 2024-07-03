package testng;

import org.testng.annotations.Test;

//Depending on test groups means one group will depend on other groups to execute
//dependencies should accept in string format when single string is taken use "", bt when multiple strings are
//taken use array string format {"",""}.
//before executing the main test all the groups that main test depends on should be executed so dat main group will execute
//when the depend groups or methods are failed to execute TESTNG consider the failure of entire group so dat it
//will skip the next methods or groups to execute.
//when we use alwaysrun="true" parameter it doesnt bother abt the failure of groups it will execute the main groups or method.
//smoke->sanity->regression->releasetesting->producttesting.

public class testdepongroups {
	
  @Test(groups="smoke")
  public void test1() {
	  System.out.println("smoke");
	  
  }
  @Test(groups="regression")
  public void test2() {
	  System.out.println("regression");
	  
	  
  }
  @Test(groups="sanity")
  public void test3() {
	  
	  System.out.println(5/0);
	  
  }
 @Test(dependsOnGroups = "smoke",alwaysRun=true)
  public void test0() {
	 
 
	  System.out.println("maintest");
	  
 }
 @Test(groups="sanity")
public void test4() {
	  
	  System.out.println(5/0);
	  
}  
  
 @Test(groups="sanity",dependsOnMethods="sam") 
public void test5() {
	  
	  System.out.println(5/0);
}  
  
 @Test(groups="smoke")
public void test6() {
	  
	  System.out.println(5/0);
}
 @Test(dependsOnGroups = {"smoke","sanity","regression"}) 
 public void test8() {
		  
		  System.out.println(5/0);
		  
	  }
  
  
	  }
  
 /* <suite>
  * <test>
  * <groups>
  * <depedndencies>
  *< group name="sanity depends-on="smoke"/>
   *< group name="regression depends-on="sanity"/>
  * </dependencies>
  * </groups>
  * <classes>
  * <class name=testdependonngroups>
   *</class>
  * </classes
  * </dependencies>
  * </groups>
  * </test>
   </suite>*/
  
  
