package day2excercise;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CWFindelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();

        driver.findElementById("lst-ib").sendKeys("Naveen",Keys.ENTER);
        
		
		List<WebElement> partialLinkText = driver.findElementsByPartialLinkText("Naveen");
		System.out.println(partialLinkText.size());
		
	}

}
