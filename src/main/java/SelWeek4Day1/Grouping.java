package SelWeek4Day1;

import org.testng.annotations.Test;

import com.google.common.base.Throwables;

import static org.testng.Assert.assertThrows;

import org.testng.annotations.*;


public class Grouping {
	
	@BeforeMethod(groups="common")
	public void beforeMethod() {
		System.out.println("Should always run before every test case");
	}
	
	@AfterMethod(groups="common")
	public void afterMethod() {
		System.out.println("Should always run after every test case");
	}
	
	@Test(groups= {"smoke"})
	public void smokeTest() {
		System.out.println("It is a smoke test case no 1");
		throw  new RuntimeException();
	}
	
	@Test(groups= {"smoke"})
	public void smokeTest1() {
		System.out.println("It is a smoke test case no 2");
		
	}
	
	@Test(groups= {"sanity"},dependsOnGroups="smoke")
	public void sanityTest() {
		System.out.println("It is a sanity test case");
	}
	
	@Test(groups= {"regression"})
	public void regressionTest() {
		System.out.println("It is a regression test case");
	}

}
