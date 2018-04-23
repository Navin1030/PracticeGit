package Homeworks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SPICinemasPractise {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicinemas.in/");
		 WebElement location = driver.findElementByXPath("//b[@class='dropdown-arrow']");
		 location.click();
		 driver.findElementByXPath("//div[@class='selectric-scroll']/ul/li[2]").click();
		 driver.findElementByXPath("//a[@class='button postfix']").click();
		 Thread.sleep(3000);
		 //Movies tab
		 driver.findElementByXPath("//a[text()='Movies']").click();
		 //Selecting the movie
		 driver.findElementByXPath("//a[text()='BAAGHI 2']").click();
		 //Select chennai = new Select(location);
		 //chennai.selectByVisibleText("Chennai");
		 //Selecting number of tickets
		 Thread.sleep(2000);
		 driver.findElementByXPath("//a[@class='filter__by']").click();
		driver.findElementByXPath("//ul[@class='filter__list ']/li/a").click();
		driver.findElementByXPath("//ul[@class='filter__list-inline']/li[4]").click();
		 WebElement moviedata = driver.findElementByXPath("//div[@class='movie__meta-data']");
		System.out.println(moviedata.getText());
		driver.findElementByXPath("(//img[@class='owl-lazy'])[3]").click();
        File src = driver.getScreenshotAs(OutputType.FILE);
        File des = new File("./snaps/Baagi2.png");
        FileUtils.copyFile(src, des);
        

	}

}
