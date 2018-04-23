package TestNGBasics;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestCase2 {
	@Test
	public void testcase() {

	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
	
	WebElement checkbox = driver.findElementByXPath("//div[@class='example']/input[5]");
    checkbox.click();
    System.out.println("The check box is checked");
    //driver.close();
	
}
}