package testng;



import java.awt.Desktop;
import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

//Extent reports is an open source reporting library useful  reproducing reports
//These extent reports are available only for only java and .net languages
// we can use this extent reports for testng, cucumber ,bdd,j unit , n unit api also.
//for test automation and it can be integrated wid frameworks like J,N TESTNG frameworks.
//These results are HTML documents that depict results as pie.
//the most important factors that should be consider while developing framework are reports,
//code reusability,configuration,test data,object repository(how ur storing elements like html elements)
//Extenet report libraries are available for   java and .nret language only.

//Extent reports// 2 versions community(free) and professional.(licensed)
//if we want to make test as pass  we need to add the  log details of  pass


public class extentrepots{

	@SuppressWarnings("unused")
	public  static void main (String[] args ){

		/*	extentrepots extentreports=new extentrepots();
		ExtentSparkReporter sparkreporter=new ExtentSparkReporter("C:\\Users\\Robin\\eclipse-workspace\\testng\\reports.html");
		extentreports.attachReporter(sparkreporter);

		ExtentReports test1= extentreports.createtest("test1");
		test1.pass("this is passed");

		ExtentReports test2= extentreports.createtest("test2");
		test2.log(Status.FAIL"this is failed");

        extentreports.createtest("test3").skeip("this is skipped");

		extentreports.flush();	
		Desktop.getDesktop().browse(new File("reports.html").toURI();


		 */


		// log levels  present in extent reports 
		//fail 
		//skip
		//warning
		//pass
		//info

		/*we can use  method chaining process for redability
		extentreports
		when we have multiple log sttaus to test the top log status will be shown as  a test status
		we have to use log events appropriately. we shouldn't use the multiple log events at at time for 1 test case
		here we have logged the info as  a text based data
		.cretaetest("test1")
		.log(status.info,"info1")
		.log(status.info,"info2")
		.log(status.info,"info3")
		.log(status.info,"info4")
		.log(status.info,pass,"pass")
		.log(status.info,fail,<i>"fail"</i>)
		.log(status.info,warnig,<b>"warning"</b>)
		.log(status.info,skip,"skip")
		 */

		/*when we log the data as  a xml or json we have to use markuphelper method
		 extentreports generate repotts as html 

         //xml
		 extentreports
		 .createtest("json based test")
		 .info(markuphelper.createcodeblock(xmldata,codelanguage.xml);


          //json
		  extentreports
		 .createtest("json based test")
		 .log(status.info,markuphelper.createcodeblock(jsondata,codelanguage.json);
		 
		 
		 
		 list<string> listdata=new arraylist<>();
		 mapdata.add("yadagiri");
		 mapdata.add(,"reddy");
		 mapdata.add("john");
		 mapdata.addt(,"cena");
         mapdata.add("rebaca");





		 map<integer,string> mapdata=new hashmap<>();
		 mapdata.put(101,"yadagiri");
		 mapdata.put(1021,"reddy");
		 mapdata.put(103,"john");
		 mapdata.put(104,"cena");
         mapdata.put(105,"rebaca");
         
        //list set
        extentreports
        .createtest("list based data")
        .info(markuphelper.cretecodelist(listdata))
        
        
        //map
        extentreports
        .createtest("map based data")
        .info(markuphelper.cretecodelist(mapdata))
        
        
        //to cretae the text type and colour for log,there is a method inside the markuphelper createlable
         * extentreporter
         * .createtest("highlight log text")
         * .info("highlight tht log test")
         * .info(markuphelper.createlable("this is a highlighted text",extentcolor."red")
         * 
         * 
         *exceptions as a log test
         *
         *cusomized exception
         *
         *try{int i=5\0;}
         *catch(Exception e){
         *extentreports
         *.createtest("exception test1")
         *.info(e)   
         *.fail(e)      
         *}
         * 
         * 
         *runtime excpetion
         * 
         * throwable t= new runtimeexception("this is a  custom exception");
         * extentreports
         * .createtest("exception test2)
         * .info(t);
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
        
        

		 */


	}
}












