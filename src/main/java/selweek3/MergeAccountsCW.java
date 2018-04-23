package selweek3;

import org.junit.Test;

import SELWeek2Day2.LoginMethods;

public class MergeAccountsCW extends LoginMethods {

	@Test
	public void mergeAccountsCW() {

		login();
		// Click crm/sfa link
		click(locateElement("xpath", "//div[@id='label']/a"));
		// Click Accounts
		click(locateElement("xpath", "(//div[@class='x-panel-header']/a)[4]"));
		// Click merge Accounts
		click(locateElement("xpath", "//a[text()='Merge Accounts']"));
		// click the lookup for From account
		click(locateElement("xpath", "//img[@alt='Lookup']"));
		// Move to new window
		switchToWindow(1);
		// Enter Account ID
		type(locateElement("xpath", "//input[@name='id']"), "10053");
		// click Find Accounts
		click(locateElement("xpath", "//button[@class='x-btn-text']"));
		// Click First Resulting Accounts
		click(locateElement("xpath", "//div[contains(@class,'x-grid3-cell-inner x-grid3-col')]"));
		// Switch back to primary window
		switchToWindow(0);
		// click the lookup for To account
		click(locateElement("xpath", "//img[@alt='Lookup']"));
		// Switch back to child window
		switchToWindow(1);
		// Enter Account ID
		type(locateElement("xpath", "//input[@name='id']"), "10054");
		// click Find Accounts
		click(locateElement("xpath", "//button[@class='x-btn-text']"));
		// Click First Resulting Accounts
		click(locateElement("xpath", "//div[contains(@class,'x-grid3-cell-inner x-grid3-col')]"));
		// Switch back to Parent  window
		switchToWindow(0);
		//click Merge without snap as it will throw Alert
		clickWithOutSnap(locateElement("xpath", "//a[@class='buttonDangerous']"));
		//Accept Alert
		acceptAlert();
		//Click Find Accounts
		click(locateElement("xpath", "//button[@class='x-btn-text']"));
		//Enter From Account ID
		type(locateElement("xpath", "//input[@name='id']"), "10053");
		//Click Find Accounts
		click(locateElement("xpath", "//button[@class='x-btn-text']"));
		//Verify the display message
		//verifyExactText();
		//Close the browser
		closeBrowser();
	}

}
