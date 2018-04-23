package Homeworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SETCPractise {
	
	@Test
	public void createAccount() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tnstc.in/TNSTCOnline/preUserRegistration.do");
		
		driver.findElementByXPath("//input[@name='txtUserLoginID']").sendKeys("TestParticipantA");
		driver.findElementByXPath("//input[@name='txtPassword']").sendKeys("dummy123");
		driver.findElementByXPath("//input[@name='txtConfirmPassword']").sendKeys("dummy123");
		
		Select securityQuestion = new Select(driver.findElementByXPath("//select[@name='txtSecretQuestion']"));
		securityQuestion.selectByVisibleText("Favourite pet's name?");
		driver.findElementByXPath("//input[@name='txtSecretAnswer']").sendKeys("piku");;
		
		driver.findElementByXPath("//input[@name='txtUserFullName']").sendKeys("Piggy mouth");
		
		driver.findElementByXPath("//input[@name='txtDateOfBirth']").clear();
		driver.findElementByXPath("//input[@name='txtDateOfBirth']").sendKeys("04/04/1994");
		/*driver.findElementByXPath("//img[@src='images/cal.gif']").click();
		Set<String> Allwindows = driver.getWindowHandles();
		//converting to List from set
		List<String> windowList = new ArrayList<String>();
		windowList.addAll(Allwindows);  //Storing all the webelement from set to List
		driver.switchTo().window(windowList.get(1));*/
		
		driver.findElementByXPath("//input[@name='txtEmailId']").sendKeys("testppt@hotmail.com");
		driver.findElementByXPath("//input[@name='txtStreetAddress']").sendKeys("Phoneix square");
		driver.findElementByXPath("//input[@name='txtCityOrTown']").sendKeys("Trichy");
		driver.findElementByXPath("//input[@name='txtState']").sendKeys("Tamil Nadu");
		driver.findElementByXPath("//input[@name='txtZipOrPostalCode']").sendKeys("620020");
		driver.findElementByXPath("//input[@name='txtPhoneNo']").sendKeys("7766554433");
		driver.findElementByXPath("//input[@name='txtMobileNo']").sendKeys("7766554433");
		
		driver.findElementByXPath("//input[@name='chkRules']").click();
		driver.findElementByXPath("//a[text()='Register']").click();
		
		
	}

}
