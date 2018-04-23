package SelWeek4Day1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SELWeek2Day2.LoginMethods;

import org.openqa.selenium.WebElement;

public class DeleteLead extends LoginMethods{
	
	@Test(groups= {"sanity"},dependsOnGroups="smoke")
	public void deleteLeadTestCase() throws InterruptedException {
		
	login();
	WebElement CRMSFA = locateElement("linkText", "CRM/SFA");
	click(CRMSFA);
	WebElement Leads = locateElement("linkText", "Leads");
	click(Leads);
	WebElement FindLeads = locateElement("linkText", "Find Leads");
	click(FindLeads);
	type(locateElement("xpath", "(//input[@name='firstName'])[3]"),"Navin");
	click(locateElement("xpath", "//button[text()='Find Leads']"));
	WebElement result = locateElement("xpath", "(//a[@class='linktext'])[4]");
	result.click();
	click(locateElement("xpath", "//a[@class='subMenuButtonDangerous']"));

	/*WebElement PhoneTab = locateElement("xpath", "//span[text()='Phone']");
	click(PhoneTab);
	WebElement SearchPhoneNo = locateElement("xpath", "//input[@name='phoneNumber']");
	type(SearchPhoneNo,"98");
	WebElement FindLeadsBtn = locateElement("xpath", "//button[text()='Find Leads']");
	click(FindLeadsBtn);
	WebElement ResultFirstLead = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
	//wait(ResultFirstLead);
	WebElement text1=locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
	String fromid=getText(text1, "");
	System.out.println(fromid);
	click(ResultFirstLead);
	WebElement DeleteLead = locateElement("xpath", "//a[text()='Delete']");
	click(DeleteLead);
	WebElement FindLeads2 = locateElement("linktext", "Find Leads");
	click(FindLeads2);
	WebElement LeadId = locateElement("xpath", "//input[@name='id']");
	type(LeadId,fromid);
	WebElement FindLeadsBtn2 = locateElement("xpath", "//button[text()='Find Leads']");
	click(FindLeadsBtn2);
	WebElement chkerrmsg = locateElement("xpath", "//div[text()='No records to display']");
	verifyExactText(chkerrmsg,"No records to display");
	closeBrowser();  */
}
}


