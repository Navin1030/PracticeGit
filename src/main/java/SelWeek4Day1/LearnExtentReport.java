package SelWeek4Day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       
		//It will create a HTML file
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true); //It will store the previous run history in the HTML page
		
		//It will attach the test cases report to the HTML page
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		
		//For giving the name and description for the test case
		ExtentTest test = extent.createTest("Test cases", "Running the demo test cases");
		
		test.assignAuthor("Navin");
		test.assignCategory("smoke");
		
		//sys outing the test case result
		test.pass("Demosalesmanager entered sucessfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img2.png").build());
		test.pass("Demosalesmanager entered sucessfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img3.png").build());
		test.fail("Demosalesmanager entered sucessfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img4.png").build());
		
		//compulsory we need to use this line at the end of the code
		extent.flush();
		
	}

}
