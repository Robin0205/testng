package testng;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


//object[], object [] [], iterator<string>, iterator<String[]>-this are the return types dataprovider will accept.

//What are the user defined data types.

/*Public void employee()
 
    employee[] ----this is the user defined data type ---we can create data type by the class name
{     creating the data type of the object that used in employee isd called user defined data type.
    
   system.out.println("this is the user defined class);
   }
 */

  /*why we use mostly object[][] array as a datatype because it is the super calss of all the data types (integer,string,float,double)
Return types of the datatypes are (object[],object[] [] ,iterator<object>,iterator<object[]>
object can be replaced with the any of the data type (pre-defined /user defined method)
user defined datatype means we will create one class and create a data type of a object name called employee now
employee is a user defined datatype.
when  we know the specific type of the datatytpe that we are using then we will specify return type as a string ,integer 
or array ,bt when we use the different sets of the data types in the dataproviderr we simply say object[] beaccuse
it is a super class  of all.
string []---combination of multiple arrays is called string artray , same to the string and object aslo
when u have combination of different data types then we have to use the object type as the returm types. */

public class dataproiverretuentypes {

	/* @Test(dataProvider="dp5")
	 * 
   public void loginte(String s) throws Exception {  //two dimensional string array is a combination of single  dimensional  array 
    it will return single simensional array
  
	 for (int i=0;i<s.length;i++) {
	 System.out.println(s[i]);
	 }
	 System.out.println(">>>>");
  }*/



	/*  public void logintest(String username, String password) 
	 * {  
		  System.out.println(username+">>"+password);*/


	/*@Test(dataProvider="dp5")
	public void logintest(String username ,String password) throws Exception { //we can also use the string[] as the return type for the two dimentional array and
		//read the vales by  s[0],s[1].

		System.out.println (username+"_"+password);
		
		
	}
*/
	
	
	
	/*@Test(dataProvider="dp4")            //this is for the jacekd array we can read the values by the for loop 
	public void display(String[] s) {
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		
	}
*/


/* @DataProvider (name="dp1")       //string
  public String[]dp1(){
	  String [] data=new String[] { 
			  "ramesh",
			  "mahesh",
			  "anil"
  };	
	  return data; 
 }
*/
	/*@DataProvider(name="dp2")                      //integer
  public Integer[]dp2(){
		
	  Integer [] data =new Integer[] { 
			  1,
			  2,
			  3,
			  4
  };	  
	  return data;
  }
*/

	// @DataProvider  
	                                               //object[]
 /* public Object[]dp3(){
	  Object [] data=new Object[] { 
			  "ramesh",
			 2,
			1.556
  };	  
	  return data;
  }
*/

	 @DataProvider (name="dp4")                              //string
  public String[][] dp4(){
	  String [][] data=new String[][] { 
		  {"xyz","123","mahes","raju","sai"},
		  {"admin","admin123"},
		  {"Admin", "Admin122"}

	  };
	  return data;
	 }
	 

	 @DataProvider()
	 
    public String[][] dp5(){        //jacked array when cloums are infinite we use the jacked array // bt when we use the normal array it have fixed  num of colums per each row.
	String[][] data= new String[][]
	 {
		 {"xyz","admin546"},
		 {"admin","admin123"},
	     {"abc", "Admin122"}

	};	 	
	return data;
	}
	
	
	/*@DataProvider()
      public Object[][] dp5(){               //when u have combination of datatypes go for object type array
	Object[][] data= new Object[][]{

		{"hyr",123,852,"abcd"},
		 {"admin","admin123"},
	  {"abc", "Admin122",456}

 };                  

	return data;*/

//when u store the data in the to the variable in the form of a collection u have to use iterator as a return type, when u store directly u have to 
//use  array format

	/*@DataProvider()
public Iterator<String> dp6(){               //when u use the collections of string,integer we can use iterator<object,string,integer>.
	List<String> data= new ArrayList<>() ;   //list<string[]>-itertaor of string array.
			data.add("yadagiri");
			data.add("ramesh");
			data.add("mahesh");
			data.add("sunil");
			return data.iterator();
	}
	 */
	
 //when u use iterator upon set(string,integer) it will return the object as a return type. 

	//@DataProvider()
	/*public Iterator<String[]> dp7(){ 

		Set<String[]> data= new HashSet<>() ; 
		
		data.add(new String[] {"yadagiri","reddy"});
		data.add(new String[] {"john","cena"});
		data.add(new String[] {"robin","robin"});


		return data.iterator();
	
	
	
	Radhika and Ranesh

	}
}*/
}



























