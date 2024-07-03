package testng;

import java.util.Objects;

import org.testng.annotations.*;


//indicies---when we dont use the indicies the entire  tets data will be sent  to the testcase (DP-->TM)
//indicies  concept will help to send the partial data to the test method.
//by passing the index of te string (called indicies) data we can  send the data to the testcases
//@Dataprovider({0,1})
//

/*public class dataproviderpartially {
 * 
  @Test(dataProvider="dp1")
  public void  tetslogin(String s  )throws Exception {
	  System.out.println(s);
  }
  
 @DataProvider(indices = {0,1})
 
  public String[] dp1(){
	 String[] data= new String[] {
	 
	 "yadagiri", //0
	 "john",  //1
	 "Rebecca", //2
     "smith"	};//3
	 
	 return data;*/
 
 
//how to  create dataprovider in a separate class. //can we separate the dataprovider from testcalass.
 //can we store multiple dataproviders in dataproviderclass.
 //can we store multiple dataprovider classes in a project.
	 
	 
 public class dataproviderpartially {
	 
	  @Test(dataProvider="sam",dataProviderClass=datasupplier.class)
	  public void  tetslogin(Object s  )throws Exception {
		  
		  System.out.println(s);
	  }
	 
 }
	 
	 
	 
	 
	 
	 
 
  
  
  

