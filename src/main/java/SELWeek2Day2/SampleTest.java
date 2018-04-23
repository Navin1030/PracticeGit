package SELWeek2Day2;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class SampleTest extends SeMethods {
	@Test
	public void erail() throws InterruptedException {
		startApp("chrome", "https://erail.in/");
		//startApp("chrome", "https://www.swiggy.com/");
		System.out.println(driver.getTitle());
		verifyExactAttribute((locateElement("class", "icon-search")), "class", "icon-search");
		verifyPartialAttribute((locateElement("class", "icon-search")), "class", "icon-sear");
		//verifyExactAttribute((locateElement("linkText", "Stations List")), "linkText", "Stations"); //For LinkText it won't work as it is nnot a attribute
		click(locateElement("linkText", "Stations List"));
		switchToWindow(1);
		System.out.println(driver.getTitle());
		click(locateElement("linkText", "Next"));
		Thread.sleep(3000);
		click(locateElement("linkText", "Ambasamudram"));
		//verifySelected(locateElement("xpath", "//input[@id='chkSelectDateOnly']"));
		//verifyDisplayed(locateElement("class", "icon-search"));
		//verifyTitle("Indian Railways Enquiry, IRCTC Train Enquiry, Seat Availability Inquiry, Rail Info - Erail.in");
		//verifyExactText((locateElement("linkText", "Refund")), "Refund1");
		//verifyPartialText((locateElement("linkText", "Refund")), "run");
		/*
		 * WebElement uName = locateElement("id", "username"); type(uName,
		 * "DemoSalesManager");
		 */
		//selectDropDownUsingText((locateElement("id", "cmbQuota")),"Tatkal");
		 // selectDropDownUsingIndex((locateElement("id", "cmbQuota")),2);
		
		//getText(locateElement("id", "cmbQuota"));
		/*
		 * //WebElement password = locateElement("id", "password");
		 * type(locateElement("id", "password"), "crmsfa"); click(locateElement("class",
		 * "decorativeSubmit")); click(locateElement("linkText", "CRM/SFA"));
		 * click(locateElement("linkText", "Leads")); //click(locateElement("class",
		 * "decorativeSubmit"));
		 */

	}
}