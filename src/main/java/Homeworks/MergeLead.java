package Homeworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps");
        
        driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
	    driver.findElementByXPath("//img[@src='/images/fieldlookup.gif']").click();
		
	    //Window handling code converting set to List so that it is ordered
	    Set<String> allwindows = driver.getWindowHandles();
	    List<String> winList = new ArrayList<String>();
	    winList.addAll(allwindows);
	    
	    //switching to child window
	    driver.switchTo().window(winList.get(1));
	    System.out.println("In child window now");
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	    Thread.sleep(3000);
	    driver.findElementByXPath("//input[@class=' x-form-text x-form-field']").sendKeys("10");
	    Thread.sleep(3000);
	    driver.findElementByClassName("x-btn-text").click();
	    Thread.sleep(3000);
	    driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
	    
	    driver.switchTo().window(winList.get(0));
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
        System.out.println("switch back to parent window");
        Thread.sleep(2000);
        driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
        Set<String> allwindows1 = driver.getWindowHandles();
	    List<String> winList1 = new ArrayList<String>();
	    winList1.addAll(allwindows1);
	    
        driver.switchTo().window(winList1.get(1));
        System.out.println("switch back to child window again");
        driver.findElementByXPath("//input[@class=' x-form-text x-form-field']").sendKeys("10");
        
	    Thread.sleep(3000);
	    driver.findElementByClassName("x-btn-text").click();
	    Thread.sleep(3000);
	    driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
	    
	    driver.switchTo().window(winList1.get(0));
        System.out.println("switch back to parent window again"); 
        
        //clicking the Merge button
        driver.findElementByXPath("//a[@class='buttonDangerous']").click();
        
        //Handling alert popup
        driver.switchTo().alert().accept();
        
        
        
        
	}

}
