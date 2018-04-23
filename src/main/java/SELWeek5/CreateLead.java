package SELWeek5;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateLead extends SELWeek2Day2.ProjectMethods {

	@Test(dataProvider="dataSet")
	public void createLeadTestCase(String cname, String fname, String lname ) throws InterruptedException {

		//startApp("chrome", "http://www.leaftaps.com/opentaps/control/main");
		//WebElement uName = locateElement("id", "username");
		//type(uName, "DemoSalesManager");
		//WebElement Passwd = locateElement("id", "password");
		//type(Passwd, "crmsfa");
		//WebElement Login = locateElement("class", "decorativeSubmit");
		//click(Login);

		WebElement CRMSFA = locateElement("linkText", "CRM/SFA");
		click(CRMSFA);
		WebElement Leads = locateElement("linkText", "Leads");
		click(Leads);
		WebElement CreateLead = locateElement("xpath", "//a[contains(text(),'Create Lead')]");
		click(CreateLead);
		type(locateElement("xpath", "(//input[@name='companyName'])[2]"),cname);
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"),fname);
		type(locateElement("xpath", "(//input[@name='lastName'])[3]"),lname	);
		//type(locateElement("","(//input[@name='primaryEmail'])[4]"))
		click(locateElement("xpath", "//input[@class='smallSubmit']"));


	}
	
	@DataProvider(name="dataSet")
	public Object[][] getData() throws IOException {
	
		//passing the data through excel sheet
		ReadExcel obj = new ReadExcel();
		Object[][] data = obj.readExcel();
		
		
		/*Object[][] testData = new Object[2][3];
		
		testData[0][0] = "companyA1";
		testData[0][1] = "Navin";
		testData[0][2] = "Ravi";
				
	    testData[1][0] = "companyB1";		
		testData[1][1] = "Sam";
		testData[1][2] = "Deepak";
		return 	testData;	*/
		return data;
	}
    


}



