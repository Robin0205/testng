package testng;

import org.testng.ITestContext;
import org.testng.ITestNGListener;
import org.testng.annotations.Test;
import org.testng.internal.annotations.IListeners;



//The below mentioned methods will execute depends on the status of the test execution.

public class cusotmlisteners implements IListeners {
	
	
	
//This belong to IListener and will execute before starting test set/batch
 
  public void ontsart(ITestContext arg) {
	  System.out.println("starts test execution......."+arg.getName());
	  
//This belong to IListener and will execute after starting test set/batch	  
  }
  public void onfinish(ITestContext arg) {
	  System.out.println("finish test execution......."+arg.getName());
  }
	  	
//This belong to IListener and will execute when test start to execute  
  
  public void  OnTestStart(ITestContext arg) {
	  System.out.println("finish test execution......."+arg.getName());
	  
}
//This belong to IListener and will execute when test is  skipped	  
   
  public void OnTestSkipped(ITestContext arg) {
	  System.out.println("finish test execution......."+arg.getName());
  }
  
//This belong to IListener and will execute when test will sucess 
  
  public void OnTestSucess(ITestContext arg) {
	  System.out.println("finish test execution......."+arg.getName());
	  
  }
//This belong to IListener and will execute when a test is failed	  
  
  public void OnTestFilure(ITestContext arg) {
	  System.out.println("finish test execution......."+arg.getName());
	  
	  
  }
  //not so important ignore as of now....
  public void OnTestFailureButWithinSucessPercentage(ITestContext arg) {
  
  }
@Override
public Class<? extends ITestNGListener>[] getValue() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public void setValue(Class<? extends ITestNGListener>[] value) {
	// TODO Auto-generated method stub
	
}  
  
}
