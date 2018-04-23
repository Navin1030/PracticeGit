package selweek3;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/");
		driver.findElementByLinkText("Sortable").click();

	}

}


/*public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://jqueryui.com/sortable/");
driver.switchTo().frame(0);
WebElement sourceItem1 = driver.findElementByXPath("//ul[@id='sortable']/li");
WebElement sourceItem4 = driver.findElementByXPath("//ul[@id='sortable']/li[4]");
Actions sortAction = new Actions(driver);
sortAction.dragAndDropBy(sourceItem1, 0, sourceItem4.getLocation().getY()).perform();


}   */