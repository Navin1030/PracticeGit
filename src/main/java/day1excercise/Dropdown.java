package day1excercise;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
       
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads");
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementByClassName("inputBox").sendKeys("TestLeaf");
		//Thread.sleep(5000);
		//driver.findElementById("createLeadForm_firstName").sendKeys("Naveen");
		//driver.findElementById("createLeadForm_lastName").sendKeys("Ravi");
		
		WebElement dataSourceId = driver.findElementByName("dataSourceId");
		Select dropdown = new Select(dataSourceId);
		dropdown.selectByVisibleText("Employee");	
		
		WebElement marketingCampaignId = driver.findElementByName("marketingCampaignId");
		Select dropdown1 = new Select(marketingCampaignId);
		dropdown1.selectByVisibleText("Pay Per Click Advertising");
		
		List<WebElement> alloptions = dropdown1.getOptions();
		System.out.println(alloptions.size());
		for (WebElement getAllOptions : alloptions ) {
			System.out.println(getAllOptions.getText());
			
			
		}
		
		

	}

}
