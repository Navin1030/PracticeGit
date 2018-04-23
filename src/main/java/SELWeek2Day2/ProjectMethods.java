package SELWeek2Day2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import SELWeek2Day2.SeMethods;

public class ProjectMethods extends SeMethods {
    
	@Parameters({"url","username","pwd"})
	@BeforeMethod
	public void login(String url, String username, String pwd) {
		
		startApp("chrome",url);
		type(locateElement("xpath", "//input[@id='username']"), username);
		type(locateElement("xpath", "//input[@id='password']"), pwd);
		click(locateElement("xpath", "//input[@type='submit']"));
		
	}
}
