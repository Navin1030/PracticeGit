package Homeworks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxUncheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
