
package demotest;


import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

/*ignoring is similar to dat of enabled="false" bt it is done at test level menas all the methods in  test classes will be disbaled
//in order to disable the specific methods in  test classes,all the test methods in testing class, test methods in package
(ignore concept is used)

//ignore specific test method @IGNORE is a annotation that shouold be given above @test annotation
//ignore all the methods in a testng class @IGNORE at thes class level(even if we are excuting class from xml also
 *  it wont execute because of ignore at class level
//ignore all the test methods in a package----to do this we have to create package-info.java file 
 * */



@Ignore
public class ignoremethods {
	
	@Test(enabled=true)            //though we enabled test cases @ignore annotation has highest priority and it will fail  the test method to execute
	public void test1() {
		System.out.println("test1");
	}	  

	@Test
	public void test2() {
		System.out.println("test2");
	}


	@Test
	public void test3() {
		System.out.println("test3");



	}
}
