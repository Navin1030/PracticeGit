package SELWeek2Day2;


public class LoginMethods extends SeMethods {

	public void login() {
		
		startApp("chrome", "http://leaftaps.com/opentaps/control/main");
		type(locateElement("xpath", "//input[@id='username']"), "DemoSalesManager");
		type(locateElement("xpath", "//input[@id='password']"), "crmsfa");
		click(locateElement("xpath", "//input[@type='submit']"));
		
	}
}
