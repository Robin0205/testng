package testng;

import org.testng.annotations.*;


/*
optional parameters can be used  in suite level and  aslo in test method levels
by using optional parameters the test methods will execute though  we wont give any parameters 
they will execute by taking the default parameters
@optional("chrome") string browsername) i is the parameter that should pass in to the method level


enable and disbaled testcases <test name = "testgoogle" enable="false">
inside the testng xml  file if there are 4 tests and we want to execute the  only 2 of them ,
we can give the commnad called(enabled="false") this command

This command will make the tests not to execute and  
if u want  not to  execute the test cases then only u should 
use this method or else it xml is directly executed */






public class opnenabledisable {
	

  public void f() {
	
  }
}
