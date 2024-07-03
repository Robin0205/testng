package practice;

import org.testng.annotations.*;

public class groupin {
	
	@Test()
	public void test0() {
		System.out.println("testclass1  >> method0 "+ Thread.currentThread().getId());
		
		
	}
	@Test
	public void test1() {
		System.out.println("testclass1  >> method1 "+ Thread.currentThread().getId());
		
		
	}
	@Test
	public void test2() {
		
		System.out.println("testclass1  >> method2 "+ Thread.currentThread().getId());
		
		
	}
	@Test
	public void test3() {
		System.out.println("testclass1  >> method3 "+ Thread.currentThread().getId());
		
		
	}

 
}
