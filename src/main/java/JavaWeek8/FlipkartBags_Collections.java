package JavaWeek8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartBags_Collections {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement UTF8 = driver.findElementByXPath("//button[text()='✕']");
		UTF8.click();
		
		driver.findElementByClassName("LM6RPg").sendKeys("Bags");
		driver.findElementByClassName("vh79eN").click();
		
		Thread.sleep(5000);
		List<WebElement> itemAmount = driver.findElementsByXPath("//div[@class='_1vC4OE']");
		
		List<Integer> pricelist = new ArrayList<Integer>();
		
		System.out.println("The Pricelist for bags are as below:");
		
		for (WebElement price : itemAmount) {
			//System.out.println(price);
			String list = price.getText();
			String pricevalue=list.substring(1);
			if(pricevalue.contains(",")) {
				 pricevalue = pricevalue.replace(",", "");
			}
			
			int parseInt = Integer.parseInt(pricevalue);
			
			
			
			System.out.println(parseInt);
			pricelist.add(parseInt);
		}
		
		Collections.sort(pricelist);
		
		System.out.println("The cost of the cheapest bag is "+pricelist.get(0));
		
		driver.close();
		
	}

}
