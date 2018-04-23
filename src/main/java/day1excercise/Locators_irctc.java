package day1excercise;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators_irctc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
         ChromeDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
         
     
         //driver.findElementByLinkText("Sign up").click();
         
         Thread.sleep(3000);
         //User name, password and confirm password
         driver.findElementById("userRegistrationForm:userName").sendKeys("dummyuserID");
         driver.findElementById("userRegistrationForm:password").sendKeys("Naveen1992");
         driver.findElementById("userRegistrationForm:confpasword").sendKeys("Naveen1992");
         
         //Security question drop down
         Select Securityquestiondd = new Select(driver.findElementById("userRegistrationForm:securityQ"));
         Securityquestiondd.selectByVisibleText("Who was your Childhood hero?");
         
         //Security answer
         driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("scoobydo");
         
         //Preferred Language drop down
         Select Languagedropdown = new Select(driver.findElementById("userRegistrationForm:prelan"));
         Languagedropdown.selectByValue("en");
         
         //First name
         driver.findElementById("userRegistrationForm:firstName").sendKeys("dummyppt");
         
         //Gender
         driver.findElementById("userRegistrationForm:gender:0").click();
         
         //Marital status
         driver.findElementById("userRegistrationForm:maritalStatus:0").click();
         
         //Date of Birth drop downs
         Select Datedd = new Select(driver.findElementById("userRegistrationForm:dobDay"));
         Datedd.selectByValue("10");
         
         Select Monthdd= new Select(driver.findElementById("userRegistrationForm:dobMonth"));
         Monthdd.selectByValue("10");
         
         Select Yeardd = new Select(driver.findElementById("userRegistrationForm:dateOfBirth"));
         Yeardd.selectByVisibleText("1992");
         
         //Occupation
         Select Occupationdd = new Select(driver.findElementById("userRegistrationForm:occupation"));
         Occupationdd.selectByValue("2");
         
         //Country
         Select Countrydd = new Select(driver.findElementById("userRegistrationForm:countries"));
         Countrydd.selectByVisibleText("India");
         
         //email
         driver.findElementById("userRegistrationForm:email").sendKeys("dummyppt@hotmail.com");
         
         //Phone number
         driver.findElementById("userRegistrationForm:mobile").sendKeys("9998886789");
        
         //Nationality
         Select Nationalitydd = new Select(driver.findElementById("userRegistrationForm:nationalityId"));
         Nationalitydd.selectByValue("94");
         
         //Flat no
         driver.findElementById("userRegistrationForm:address").sendKeys("15 tambram chennai");
         
         //Pin code
         driver.findElementById("userRegistrationForm:pincode").sendKeys("600036",Keys.TAB);
         
         Thread.sleep(3000);
         //City drop down
         Select Citydd = new Select(driver.findElementById("userRegistrationForm:cityName"));
         Citydd.selectByValue("Chennai");
         Thread.sleep(2000);
         //Post Office drop down
         Select PostOfficedd = new Select(driver.findElementById("userRegistrationForm:postofficeName"));
         PostOfficedd.selectByValue("Indian Institute Of Technology S.O"); 
         
         //Land line
         driver.findElementById("userRegistrationForm:landline").sendKeys("444555789");
         
        System.out.println("Completed filling the irctc form"); 
         
	}

}
