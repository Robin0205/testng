package exreports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class logs {

	public static void main(String[] args) throws IOException {

		ExtentReports ex = new ExtentReports();
		File fi = new File("report.html");
		ExtentSparkReporter spark = new ExtentSparkReporter(fi);
		ex.attachReporter(spark);

		// log data in form of bold and italic text

		/*
		 * ExtentTest test1=ex.createTest("test 1");
		 * test1.log(Status.PASS,"this is passed test case");
		 * test1.log(Status.INFO,"<i>this is passed test case<i/>");
		 * test1.log(Status.INFO,"<b>this is passed test case</b>");
		 * test1.log(Status.INFO,"<i><b>this is passed test case</i></b>"); ex.flush();
		 * Desktop.getDesktop().browse(new File("report.html").toURI());
		 */

		// log the json and xml form of data to the test //by using this we cant see the
		// data in detail section of extentreports

		/*
		 * String xmldata= ("<menu id=\"file\" value=\"File\">\r\n" + "  <popup>\r\n" +
		 * "    <menuitem value=\"New\" onclick=\"CreateNewDoc()\" />\r\n" +
		 * "    <menuitem value=\"Open\" onclick=\"OpenDoc()\" />\r\n" +
		 * "    <menuitem value=\"Close\" onclick=\"CloseDoc()\" />\r\n" +
		 * "  </popup>\r\n" + "</menu>");
		 * 
		 * String jsondata=("{\"menu\": {\r\n" + "  \"id\": \"file\",\r\n" +
		 * "  \"value\": \"File\",\r\n" + "  \"popup\": {\r\n" +
		 * "    \"menuitem\": [\r\n" +
		 * "      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\r\n" +
		 * "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\r\n" +
		 * "      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\r\n" + "    ]\r\n"
		 * + "  }\r\n" + "}}");
		 * 
		 * ex.createTest("xml based data").log(Status.INFO,xmldata);
		 * ex.createTest("json based data").log(Status.INFO,jsondata ); ex.flush();
		 * Desktop.getDesktop().browse(new File("report.html").toURI());
		 */

		// using xml and json data

		String xmldata = ("<menu id=\"file\" value=\"File\">\r\n" + "  <popup>\r\n"
				+ "    <menuitem value=\"New\" onclick=\"CreateNewDoc()\" />\r\n"
				+ "    <menuitem value=\"Open\" onclick=\"OpenDoc()\" />\r\n"
				+ "    <menuitem value=\"Close\" onclick=\"CloseDoc()\" />\r\n" + "  </popup>\r\n" + "</menu>");

		String jsondata = ("{\"menu\": {\r\n" + "  \"id\": \"file\",\r\n" + "  \"value\": \"File\",\r\n"
				+ "  \"popup\": {\r\n" + "    \"menuitem\": [\r\n"
				+ "      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\r\n"
				+ "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\r\n"
				+ "      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\r\n" + "    ]\r\n" + "  }\r\n" + "}}");

		ex.createTest("xml based data").log(Status.INFO, MarkupHelper.createCodeBlock(jsondata,CodeLanguage.JSON));
		ex.createTest("json based data").info(MarkupHelper.createCodeBlock(xmldata,CodeLanguage.XML));
		ex.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());

	}

}
