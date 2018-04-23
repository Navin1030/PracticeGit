package Homeworks;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownLastButOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement dropdown = driver.findElementById("dropdown1");
		Select dd = new Select(dropdown);
		List<WebElement> options = dd.getOptions();
		System.out.println(options.size());
		int LastButOne = options.size()-1;
		
		for (WebElement Lastoption : options) {
			int i=0;
			if(i==LastButOne)
			{
				Lastoption.click();
			}
			i++;
		}
        
	}

}
