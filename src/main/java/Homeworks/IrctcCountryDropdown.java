package Homeworks;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcCountryDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
        WebElement CountryDropdown = driver.findElementByName("userRegistrationForm:countries");
        Select country = new Select(CountryDropdown);
        
        
        //List<WebElement> Allcountries = country.getOptions();
        List<WebElement> options = country.getOptions();
        for (WebElement webElement : options) {
        	String text = webElement.getText();
        	System.out.println(text);
			
		}

	}

}
