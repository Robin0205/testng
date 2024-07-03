package testng;

import org.testng.annotations.*;



/*groupingis a categorizaton(groups) (smoke,functional,regression,dailybuilt,weeklybuilt,windows/IOS) of test methods under one set.
out of 100  test cases identifity 10 for smoke ,20 for sanitize,30 for functional then those are categorized
 intstead of creating different xml files grouping concept is came into picture.
groups accept the values in string array format we can assign multiple groups to single method.
we can do grouping at suite level and also test level @testlevel <test><test/> <groups> ,<run>,<include="smoke"/>
when u want to execute same named groups from multiple classes<class name="testclass1"/><class name="testclass2"/>
u just gives  both class tags and method name<include="sanity"/>
*/

/*
there are 4 groups namely -test groups -exclusion - meta groups(group of groups) -partial groups.
exclude the groups <exclude name="regression"/>...it should be done when u aasign 2 groups to one method but u want to execute the only one group then u can
exclude one group.
meta groups(group of groups) 
partial groups--if we are assigning any group at class level then all the tets methods inside the class also part of the given group.
any group name to few methods
suite level-----when we apply group at suite  level it is applicable to groups of the given name in all the tests present 
inside all the classes
regular form---<suite><groups><include name="window*"/>
 @Test(groups= "window.sanity"} */ 

@Test(groups="all")
public class groupingtest {
	
  @Test
  public void test1() {
	System.out.println("test1");
  }
  @Test(groups={"regression","sanity","windows.smoke"})
  public void test2() {
	  System.out.println("test2");
	  
  }
  @Test(groups={"regression","sanity"})
  public void test3() {
	  System.out.println("test3");
  }
  @Test(groups={"endtoend","sanity"})
  public void test4() {
	  System.out.println("test4");
  }
  @Test(groups={"regression","smoke","windows.sanity"})
  public void test5() {
	  System.out.println("test5");
  }
  @Test(groups={"functional","sanity","ios.sanity","ios.sanity"})
  public void test6() {
	  System.out.println("test6 ios.smoke");
  }
  @Test(groups={"smoke","sanity"})
  public void test7() {
	  System.out.println("test7"); 
  }
  
}

