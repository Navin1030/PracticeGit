package SelWeek4Day1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import SELWeek2Day2.LoginMethods;

public class EditLead extends LoginMethods {
	
	@Test//(groups= {"smoke"})
	public void editLeadTestCase() {
	
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
	
	click(locateElement("xpath", "(//a[@class='subMenuButton'])[3]"));
	
	WebElement editcompany = locateElement("xpath", "(//input[@name='companyName'])[2]");
	editcompany.clear();
	type(locateElement("xpath", "(//input[@name='companyName'])[2]"),"Company7");
	click(locateElement("xpath", "//input[@class='smallSubmit']"));
	
	/*WebElement FindLeads = locateElement("linktext", "Find Leads");
	click(FindLeads);
	WebElement firstname = locateElement("xpath", "//label[text()='Lead ID:']/following::input[2]");
	type(firstname,"f");
	WebElement SearchLeads = locateElement("xpath", "//button[text()='Find Leads']");
	click(SearchLeads);
	WebElement ResultFirstLead = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
	wait(ResultFirstLead);
	click(ResultFirstLead);
	verifyTitle("View Lead | opentaps CRM");
	WebElement Edit = locateElement("linktext", "Edit");
	click(Edit);
	WebElement CompName = locateElement("id", "updateLeadForm_companyName");
	clear(CompName);
	type(CompName, "FSS");
	WebElement SubmitBtn = locateElement("name", "submitButton");
	click(SubmitBtn);
	WebElement updatedName = locateElement("xpath", "//span[@id='viewLead_companyName_sp']");
	verifyPartialText(updatedName,"FSS");
	closeBrowser();*/

}
	}
