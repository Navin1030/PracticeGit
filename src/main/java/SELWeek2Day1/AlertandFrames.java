package SELWeek2Day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertandFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		//take the id or name from the iframe tag
		driver.switchTo().frame("iframeResult");
		System.out.println("I am inside the frame now");
	
		driver.findElementByXPath("//button[text()='Try it']").click();
       //Handling alert
		Alert alertOptions = driver.switchTo().alert();
		alertOptions.getText();
		alertOptions.sendKeys("I learnt alert");
		alertOptions.accept();
		
		//coming out of window
		driver.switchTo().defaultContent();
		System.out.println("I am outside of the frame now");
		
		
	}

}
