package SELWeek2Day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods {

	RemoteWebDriver driver = null;

	public void startApp(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		// Maximize the browser
		driver.manage().window().maximize();
		// Load the URL
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("The " + browser + " browser launched successfully");
		takeSnap();
	}

	public WebElement locateElement(String locator, String locValue) {
		WebElement ele = null;
		switch (locator) {
		case "id":
			ele = driver.findElementById(locValue);
			break;
		case "class":
			ele = driver.findElementByClassName(locValue);
			break;
		case "linkText":
			ele = driver.findElementByLinkText(locValue);
			break;
		case "xpath":
			ele = driver.findElementByXPath(locValue);
			break;
		}
		return ele;

	}

	public void type(WebElement ele, String data) {
		ele.sendKeys(data);
		System.out.println("The given value is entered " + data);
		takeSnap();
	}

	public void click(WebElement ele) {
		ele.click();
		System.out.println("The element is clicked successfully");
		takeSnap();
	}
	public void clickWithOutSnap(WebElement ele) {
		ele.click();
		System.out.println("The element is clicked successfully");
	}

	public String getText(WebElement ele) {
		String getText = ele.getText();
		System.out.println("The text displayed on the web element is" + getText);
		return null;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub
        Select dropDownByText = new Select(ele);
        dropDownByText.selectByVisibleText(value);
        takeSnap();
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
         Select dropDownByIndex = new Select(ele);
         dropDownByIndex.selectByIndex(index);
         takeSnap();
	}

	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		String actualTitle = driver.getTitle();
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("The title is matching");
			return true;
	    }
		else {
			System.out.println("The title is not matching");
			return false;
		}
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		String actualText = ele.getText();
		if (actualText.equals(expectedText)) {
			System.out.println("The actual text "+actualText+ " is matching with expected text "+expectedText);
		}
		else {
			System.out.println("The actual text "+actualText+ " is not matching with expected text "+expectedText);
		}	
	}
	

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		String actualText = ele.getText();
		if (actualText.contains(expectedText)) {
			System.out.println("The actual text "+actualText+ " is partially matching with expected text "+expectedText);
		}
		else {
			System.out.println("The actual text "+actualText+ " is not partially with expected text "+expectedText);
		}

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
          if (ele.getAttribute(attribute).equals(value)) {
        	  System.out.println("The attribute matches");
          }else {
			System.out.println("The attribute not matching");
		}
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		if (ele.getAttribute(attribute).contains(value)) {
      	  System.out.println("The attribute matches partially");
        }else {
			System.out.println("The attribute not matching partially");
		}
	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
        if(ele.isSelected()) {
        	System.out.println("The checkbox is selected");
        }else {
        	System.out.println("The checkbox is not selected");
        }
	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
         if(ele.isDisplayed()) {
        	 System.out.println("The given element is displayed on the web page");
         }else {
			System.out.println("The given element is not displayed on the web page");
		}
	}

	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		Set<String> Allwindows = driver.getWindowHandles();
		//converting to List from set
		List<String> windowList = new ArrayList<String>();
		windowList.addAll(Allwindows);  //Storing all the webelement from set to List
		//switching to child window from parent window
		driver.switchTo().window(windowList.get(index));
		
	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
       driver.switchTo().frame(ele);
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
       driver.switchTo().alert().accept();
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
       driver.switchTo().alert().dismiss();
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		System.out.println(driver.switchTo().alert().getText());
		return null;
	}

	int i = 1;

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/img" + i + ".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
         driver.close();
         System.out.println("The browser closed sucessfully");
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
         driver.quit();
         System.out.println("All the browsers closed sucessfully");
	}

	@Override
	public WebElement locateElement(String locValue) {
		// TODO Auto-generated method stub
		return null;
	}

}
