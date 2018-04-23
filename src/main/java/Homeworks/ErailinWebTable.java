package Homeworks;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailinWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://erail.in/");
        //From station
        driver.findElementById("txtStationFrom").clear();
        driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
        
        //To station
        driver.findElementById("txtStationTo").clear();
        driver.findElementById("txtStationTo").sendKeys("CBE",Keys.TAB);
        
        //Get Trains
        driver.findElementById("buttonFromTo").click();
        
        //automating the table
        WebElement table = driver.findElementByXPath("//table[@class='DataTable DataTableHeader TrainList']");
        
	}

}
