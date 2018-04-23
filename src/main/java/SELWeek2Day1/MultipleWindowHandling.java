package SELWeek2Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.findElementByXPath("//a[text()='Contact Us']").click();
		
		Set<String> Allwindows = driver.getWindowHandles();
		//converting to List from set
		List<String> windowList = new ArrayList<String>();
		windowList.addAll(Allwindows);  //Storing all the webelement from set to List
		
		//switching to child window from parent window
		driver.switchTo().window(windowList.get(1));
		System.out.println("Switched to child window now");
		System.out.println(driver.getTitle());
		System.out.println(driver.findElementByXPath("//*[text()='011-23345400.']").getText());
		
		//switching from child window to parent window
		driver.switchTo().window(windowList.get(0));
		System.out.println(driver.getTitle());
		
		//Parent window
		driver.findElementByName("j_username").sendKeys("railman");
		System.out.println("I am back to parent window now");

	}

}
