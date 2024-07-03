package testng;

import org.testng.annotations.*;

//Dependencies ----test methods are exeuted depend on the depend test(if it is correct).
//when depednd test are ignored noting will execute nor ignore nothing will happen in this scenarioes we have to add alwaysrun="true"
//though u give the priority parameter it internally check the dependency concept n excute depend on that
//when the depend metods are ignored or skipped or deleted
//though the depednd test methods are not present inside the class we can use one parameter so dat it will 
//execute the remaining methods(ignoremissingdepedencies="true").


//create shipment
//trackins shipment---tracking num is required from (create shipment)--means this methods is depedning on create method to execute.
//cancel shipment-----tracking num is required from (create shipment)---means this methods is depedning on create method to execute.

public class testdepeonmethods {
	
 public static String trackingnum=null;
	
  @Test
  public void createshipment() {
	  System.out.println(5/0);
	  System.out.println("createshipment");
	  trackingnum="ABC123";
	  
	  
  }
  
 @Test (dependsOnMethods = "createshipment")
 public void trackingshipment() throws Exception {
	 
	 if(trackingnum !=null)
	 System.out.println("tracckingshipment");
	 
     else
	 
     throw new Exception("invalid tracking number");
	  
  }

 @Test (dependsOnMethods = {"createshipment","tracckingshipment"},alwaysRun=true,ignoreMissingDependencies=true)
 public void cancelshipment() throws Exception {
	 
	 if(trackingnum !=null)
	 System.out.println("cancelshipment");
	 
	 else
		 
		 throw new Exception("invalid tracking number");
	  
	  
 } 
  
  
  
  
}
