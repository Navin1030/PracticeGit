package day1excercise;



import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsCW {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
       
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads");
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementByClassName("inputBox").sendKeys("TestLeaf");
		Thread.sleep(5000);
		driver.findElementById("createLeadForm_firstName").sendKeys("Naveen");
		driver.findElementById("createLeadForm_lastName").sendKeys("Ravi");
		driver.findElementByName("submitButton").click();
}

}
