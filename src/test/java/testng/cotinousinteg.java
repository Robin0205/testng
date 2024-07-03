package testng;

public class cotinousinteg {

	public static void main(String[] args) {
		/*Implementation, Execution,Maintanence
		 * in these execution and maintanence both comes under continous integration.
		 * CI is a process where the QA or developer and devops so these 3 teams work together to achiece a goal
		 * 
		 *  we can execute the test cases in 4 ways
		 *  1.Run TC through pom.xml
		 *  2.Run TC through Maven CLI(COMMAND LINE INTERFACE)
		 *  3.Run TC through run.bat file
		 *  4.Run TC using jenkins (using bat.file)
		 *  
		 *  1.Run TC using POM.XML within Eclipse
		 *  we need to add these plugins in pom.xml after properties tag and before dependencies tag. 
		 *  plugins--->used to run your Maven Project
		 *  
		 *  maven-compiler--plugin(compiling TC)
		 *  maven--surefire--plugin(it is required for executing the TC)
		 * when u execute the TC first time in pom.xml it will show error beacuse POM.XML needs JDK to execute the TC
		 * Eclipse window--> preferences--->java---> installed JRE's--->and check ur installed JRES.
		 * 
		 * 
		 * 
		 * 2.Run TC using command propt(without using ECLIPSE)
		 * MAVEN is a software which is developed by the Apache  software foundation dat is present in 2 flavours 1.maven eclipse
		 * (which is already present in the eclipse)2.maven (complete installer on specific OS)
		 * to do this we have to download entire maven on windows
		 * Maven download 
		 * command propmpt---mvn -version.
		 * 
		 * This is the location dat we have to add in the command propmpt (project location)
		 * location of the project---C:\Users\Robin\eclipse-workspace\testng
		 * mvn clean install(it will clean previous execution staff and start excution of the present project)
		 * clean command will clean everything.
		 * 
		 * 3.Run TC using run.bat file
		 * to do thid we have to cretae run.bat file in project path location 
		 * by doing double click on dat file  it will internally ope the command prompt and there the execution will start
		 * 
		 * 4.Run TC using jenkins
		 * 
		 * Download and configure jenkins
		 * (username: Robin , password:Robin@2806)
		 * we can run our project in 2 ways in JENKINS
		 * 
		 * 1.Freestyle(we can run with bat file )if we choose freestyle
		 * 
		 * jenkins url: http://localhost:8080/
		 * steps:
		 * New item--provide name of project--freestyle--ok
		 * go to build section--execute window batch command--specify path of run.bat file(cd C:\Users\Robin\eclipse-workspace\testng
		 * run.bat--save
		 * go to dashboard---u ca see new item(project) is cretaed.
		 * now select ur project from dashboard and click on build now--if u click on build history it will show logfiles
		 * in the console 
		 * no UI is visible to user only backend execution takes place.
		 * it is a headless execution.
		 * 
		 * 
		 * 
		 * 2.Maven project (we can run usig POM.XML file)
		 * 
		 * jenkins url ---htp:localhost:8080/
		 * pre-requisite: JAVA_HOME configuration in jenkins
		 * Dashboard--manage jenkins--global tool configuration
		 * 
		 * steps:
		 * new item---provide name of the project--maven project--ok
		 * go to build section--specify the path of the POM.XML nad goals as shown in picture(clean install)
		 * go to dashboard--u can see new item(project) is created
		 * 
		 * STEP-1
		 * 
		 * GITHUB(web based application)
		 * go to url https://github.com
		 * signup new account 
		 * create new repository(testng
		 * this is ur project github repository url.If u want to share ur code with somebody else u have to share this url 
		 * https://github.com/ramrobin/testng.git
		 * 
		 * STEP-2
		 * Download and install git repository(local)
		 * now go to project location workspace open ur project and open git bash 
		 * enter $git init it will cretae git repository ,then add files to staging are by (git remote add origin)command
		 * before commiting files to git we have to give 2 commands
		 * git config--- global user.name  ramrobin
		 * git config---global user.email "ramrobin842@gmail.com"
		 * git commit m-"write some comment"(first rond of commit)
		 * this command will commit all files to the local repository
		 * git push-u origin master ---send all the files from git(local) to github(remote repository)
		 * press enter it will ask for the username and password(github)
		 * 
		 * once it is done ,refresh remote repository select refresh,then we can see the cahnges in remote repository
		 * now jenkins will take project from here using github url , we have to config in jenkins and jenkins will automate 
		 * the code.
		 *  
		 * 
		 * 
		 */

	}

}
