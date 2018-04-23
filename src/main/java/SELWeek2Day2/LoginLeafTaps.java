package SELWeek2Day2;

import org.junit.Test;


public class LoginLeafTaps extends LoginMethods{
	@Test
	public void loginLeaftaps() {
		
		login();
		click(locateElement("linkText", "CRM/SFA"));
		click(locateElement("linkText", "Leads"));
		//click(locateElement("class", "decorativeSubmit"));
		
	}
}





