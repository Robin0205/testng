package exreports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class listset {

	public static void main(String[] args) throws IOException {
		
		//loging the collection type of data to the test reports
		
		ExtentReports ex = new ExtentReports();
		File fi = new File("report.html");
		ExtentSparkReporter spark = new ExtentSparkReporter(fi);
		ex.attachReporter(spark);
		
		List<String > ls=new ArrayList <String>();
		ls.add("ram");
		ls.add("ramesh");
		ls.add("robin");
		ls.add("romeo");
		ls.add("trishul");
		
		
		Map<Integer,String> mp= new HashMap();
		mp.put(101, "ram");
		mp.put(102, "ramesh");
		mp.put(103, "robin");
		mp.put(104, "romeo");
		
		
		Set<Integer> setdata=mp.keySet();
		
		
		try{
			int i=5/0;
		}
		
	catch(Exception e){
		ex.createTest("Exception test1").fail(e);
		
	};
		Throwable t=new RuntimeException();
		ex.createTest("Exception test2").fail(t);
		ex.createTest("Exception test3").fail(t);
		
		
		
		
		
		
		ex.createTest("list based data").info(MarkupHelper.createOrderedList(ls));
		ex.createTest("map based data").info(MarkupHelper.createUnorderedList(ls));
		
		ex.createTest("list based data").info(MarkupHelper.createOrderedList(mp));
		ex.createTest("map based data").info(MarkupHelper.createUnorderedList(mp));
		
		ex.createTest("list based data").info(MarkupHelper.createOrderedList(setdata));
		ex.createTest("map based data").info(MarkupHelper.createUnorderedList(setdata)); 
		
		ex.createTest("highlight log test" ).info("this is not a highlighted messgae")
		.info(MarkupHelper.createLabel("This is a highlighted message",ExtentColor.BLACK));
		
		
		
		ex.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());


	}

}
