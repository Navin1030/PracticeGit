package SelWeek4Day1;
	
	import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

	public class CreateLead extends SELWeek2Day2.LoginMethods {
		//@Test(groups= {"smoke"})	
		@Test
		 public void createLeadTestCase() throws InterruptedException {
			
		//startApp("chrome", "http://www.leaftaps.com/opentaps/control/main");
		//WebElement uName = locateElement("id", "username");
		//type(uName, "DemoSalesManager");
		//WebElement Passwd = locateElement("id", "password");
		//type(Passwd, "crmsfa");
		//WebElement Login = locateElement("class", "decorativeSubmit");
		//click(Login);	 
		login();
		WebElement CRMSFA = locateElement("linkText", "CRM/SFA");
		click(CRMSFA);
		WebElement Leads = locateElement("linkText", "Leads");
		click(Leads);
		WebElement CreateLead = locateElement("xpath", "//a[contains(text(),'Create Lead')]");
		click(CreateLead);
		type(locateElement("xpath", "(//input[@name='companyName'])[2]"),"company123");
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"),"Navin");
		type(locateElement("xpath", "(//input[@name='lastName'])[3]"),"Ravi");
		click(locateElement("xpath", "//input[@class='smallSubmit']"));
		//String dta=getText(CreateLead1, "");
		//System.out.println(dta);
		/*WebElement CreateLead = locateElement("linktext", "Create Lead");
		click(CreateLead);
		WebElement CompName = locateElement("class", "inputBox");
		//click(CompName);
		type(CompName, "Financial Software and Systems Pvt ltd");
		WebElement FirstName = locateElement("xpath", "//input[@id='createLeadForm_firstName']");
		//click(FirstName);
		type(FirstName, "Chandru");
		WebElement LastName = locateElement("xpath", "//input[@id='createLeadForm_lastName']");
		type(LastName, "Swaminathan");
		WebElement SubmitButton = locateElement("name", "submitButton");
		click(SubmitButton);*/
		/*String expTitle="View Lead | opentaps CRM";
		String actTitle=null;
		getTitle(actTitle);
		if(actTitle.equals(expTitle))
		{
			System.out.println("Lead Created Successfully");
			}
		else
			System.out.println("Error occured while creating Lead");*/
			
		}

	}


