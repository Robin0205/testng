package testng;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

//screenshot name should be the name of the failure test name
//when ever testng executig tests it internally create one object called itestresult(for this there will be
//so many parameters like testname etc.
//by using these object we can get the test name
//capturescreenshot(result.getTestName());    //to get the screenshotname as same of testname
//capturescreenshot(result.getcontext()+"_".getMethod().getMethodName());(results.getname())we cam use this also 
//to get the screenshotname as same of methodname.

//when u execute the same class twice the previous failed testcases screenshots are deleted means overriding 
//of the previous testcases screenshots happend.

//dependency injeton -testng will inject the values during the runtime of the testng// user manually not going to give the values

/*
<suite>
<listners  class name="testng.ilistners> (package name.classname)
<test name="testgoogle">
<classes>
<class name ="testng.testcalss">(package name.classname)
<methods>
<include name ="testgoogle">
<include name ="testfacebook">
</include>
</methods>
</class>
</classes>
</test>
</listeners>
</suite> 
*/

public class ilistners  extends baseclass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		
		try {
			System.out.println(result.getTestContext().getName()+"_"+result.getMethod().getMethodName());//to get testname along wid the test method this is the method we should use.
			capturescreenshot(result.getTestContext().getName()+"_"+result.getMethod().getMethodName());    //to get the screenshotname as same of testname.  
		}
		catch (IOException e) {                    
			
			e.printStackTrace();
		}
  
	}	
  }

