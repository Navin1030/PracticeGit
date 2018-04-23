package TestNGBasics;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestCase1 {
	@Test
	public void testcase() {

	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://leafground.com/pages/checkbox.html");
    WebElement Ccheckbox = driver.findElementByXPath("(//div[@class='example'])[4]");
    System.out.println("C checkbox: "+Ccheckbox.isSelected());
    
    WebElement Seleniumcheckbox = driver.findElementByXPath("(//div[@class='example']/input)[6]");
    System.out.println("Selenium checkbox: "+Seleniumcheckbox.isSelected());
	

}}
