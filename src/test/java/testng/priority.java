package testng;

import org.testng.annotations.Test;


//flightbookingtest
//1.signup
//2.login
//3.searchforflight
//4.bookingflight 
//5.savetheticket
//6.logout


//in TESTNG execution of the methods in test class execute relay on the ASCII of the values of those method names
//so dat priority came into picture with dat we can give the priortiy  numbers to the method so dat the methods will
//execute in the given priority
//manner , and also there is one more method by which placing the metods in testng xml also methods will execute in proper manner
//there is a maintainorder parameter is there if we set that parameter to false  then this order also not maintained
//default priotiy value id (0),if we dont give any priority internally i will give 0 as priotity  and lower priority
//methods are executed first
// we can also pass negative prioriy values and there negavtive priority methods are executed first 
//exmaple(priority=-1)so this method executed first before the default or 0 priority execute 
// yes we can pass negative prioriy beacuse priority are in interger format the values of interger is ranges from -2^31 to 2^31 
//so integre also accepting the 
//negatiev values.......we can use same priority also no exception will throw ,if we give same priority to the multiple methods 
//then the TESTNG 
//will follow ASCII values to the methods in testcases.

public class priority {
	
  @Test(priority=1)               //@Test(priority=0)//default
  public void signup() {
	  System.out.println("signup");
	  
  
  }
  @Test(priority=2)
  public void login() {
	  System.out.println("login");
	  
  }
  @Test(priority=3)
  public void searchforflight() {
	  System.out.println("searchforflight");
	  
  }
  @Test(priority=4)
  public void bookingflight() {
	  System.out.println("bookingflight");
	  
  }
  @Test(priority=5)
 public void savetheticket() {
	 System.out.println("savetheticket");
	
}
  @Test()
 public void logout() {
	 System.out.println("logout");
	 
}
}

