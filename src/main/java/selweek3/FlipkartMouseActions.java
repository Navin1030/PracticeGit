package selweek3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement UTF8 = driver.findElementByXPath("//button[text()='✕']");
		UTF8.click();
        WebElement menaccessories = driver.findElementByXPath("//a[@title='Men']");
        WebElement Jackets = driver.findElementByXPath("//span[text()='Jackets']");
        
        Actions builder = new Actions(driver);
        builder.moveToElement(menaccessories).perform();
        Thread.sleep(4000);
        builder.moveToElement(Jackets).click().perform();
	}

}
