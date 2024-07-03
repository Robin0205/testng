package testng;

import org.testng.annotations.Test;

/*In real time environment we never feed data statically in dataprovider,instead we will store the data in some xml,
excel or JSONfile and intergrate
data dynamically with the test method.
we can add the data dynamically to the dataprovider throuh EXCEL.(APACHE POI(supports old n new excel ,JXL library(only old version)).
Excel file(spread sheet) extensions--->xls,xlsx(newer verison).
APACHE POI is a API provided by Apache foundation which is a collection of different java libraries, 
this give the facibility to write,read,and manipulate
the data in microsoft files like execl,power point and word files etc.
maven artifactids for (.xls(POI) and for (.xlsx(POI+POI-OOXML)).
*/

public class integrationexcel {
  @Test
 public void test()  { 
	  
	  System.out.println("RAMESH");
  }
}
