package testng;

import org.testng.annotations.*;

public class datasupplier {
	
	
	
 @DataProvider(name="sam")
  public Object[] sam() {
		
		Object[] ob=new Object[4];
		ob[0]=10;
		ob[1]="Robin";
		ob[2]=1023f;
		ob[3]=1456.0;
		return ob;
	}
 
	
}
