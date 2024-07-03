package practice;

import org.testng.annotations.*;

public class dp1 {
	
  @Test(dataProvider="dp8")
  public void logindata(Object s) throws Exception {
	  System.out.println(s);
	  
  }




@SuppressWarnings("unused")
@DataProvider(indices= {0,1})
public String[] dp3() {
	String [] data= new String[] 
			{
			"yadagiri",
			"reddy",
			"john",
			"cena"
	};
	return data;			
			
}

@DataProvider
public Object[] dp8() {
	Object [] data= new Object[] {
			10,
			"Robin",
			1823.0,
			2025.f
			
	};			
	
			
	return data;	
}

}	
	
	
	  

  
  
  
  
  
  
  
  
  
  
