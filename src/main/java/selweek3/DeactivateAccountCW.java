package selweek3;

import org.junit.Test;

import SELWeek2Day2.LoginMethods;

public class DeactivateAccountCW extends LoginMethods {
@Test
	public void DeactivateAccount() throws InterruptedException {
		// TODO Auto-generated method stub
	
	    login();
	    //Click crm/sfa link
	    click(locateElement("xpath", "//div[@id='label']/a"));
        //Click Accounts
	    click(locateElement("xpath", "(//div[@class='x-panel-header']/a)[4]"));
	    //Click Find Accounts
	    click(locateElement("xpath", "//a[text()='Find Accounts']"));
	    //Enter Account Name
	    type(locateElement("xpath", "(//input[@name='accountName'])[2]"),"Navin Oxy4");
	    //Enter Account ID
	    type(locateElement("xpath", "//input[@name='id']"),"11663");
	    //Click Find Accounts
	    click(locateElement("xpath", "//button[text()='Find Accounts']"));
	    //Capture Account ID of First Resulting account
	    Thread.sleep(3000);
	    getText(locateElement("xpath", "//div[contains(@class,'x-grid3-cell-inner x')]"));
	    //Click First resulting Account
	    click(locateElement("xpath", "(//a[@class='linktext'])[4]"));
	    //Verify the title of the page
	    verifyTitle("Find Accounts | opentaps CRM");
	    //Click Deactivate Account button
	    clickWithOutSnap(locateElement("xpath", "//a[@class='subMenuButtonDangerous']"));
        //Verify confirmation message
	    Thread.sleep(3000);
	    getAlertText();
	    //click ok in the alert
	    acceptAlert();
	    //Verify displayed message
	    verifyPartialText(locateElement("xpath", "//span[@class='subSectionWarning']"),"This account was deactivated");
	    //Click Find accounts
	    click(locateElement("xpath", "//a[text()='Find Accounts']"));
		//Enter Account name
	    type(locateElement("xpath", "(//input[@name='accountName'])[2]"),"Navin Oxy4");
		//Enter Account ID    
	    type(locateElement("xpath", "//input[@name='id']"),"11663");
	    //Click Find Accounts
	    click(locateElement("xpath", "//button[text()='Find Accounts']"));
	    //Verify error message
	    verifyExactText(locateElement("xpath", "//div[@class='x-paging-info']"),"No records to display");
	    //Close the browser
	    closeBrowser();
		   
	}

}
