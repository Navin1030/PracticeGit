package SelWeek4Day1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import SELWeek2Day2.LoginMethods;

public class MergeLead extends LoginMethods {
	
	@Test(groups= {"sanity"},dependsOnGroups="smoke")
	public void mergeLeadTestCase() throws InterruptedException {
		
		login();
		WebElement CRMSFA = locateElement("linkText", "CRM/SFA");
		click(CRMSFA);
		
		WebElement Leads = locateElement("linkText", "Leads");
		click(Leads);
		
		click(locateElement("xpath", "//a[text()='Merge Leads']"));
		WebElement FromLead = locateElement("xpath", "//img[@src='/images/fieldlookup.gif'][1]");
		clickWithOutSnap(FromLead);
		switchToWindow(1);
		
		type(locateElement("xpath", "//input[@name='firstName']"),"Navi");
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(3000);
		clickWithOutSnap(locateElement("xpath", "//a[@class='linktext']"));
		switchToWindow(0);
		
		WebElement ToLead = locateElement("xpath", "(//img[@src='/images/fieldlookup.gif'])[2]");
		clickWithOutSnap(ToLead);
		switchToWindow(1);
		
		type(locateElement("xpath", "//input[@name='firstName']"),"s");
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(3000);
		clickWithOutSnap(locateElement("xpath", "//a[@class='linktext']"));
		switchToWindow(0);
		
		clickWithOutSnap(locateElement("xpath", "//a[@class='buttonDangerous']"));
		
		acceptAlert();
		
	}

}
