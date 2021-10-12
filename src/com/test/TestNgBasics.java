package com.test;

import org.testng.annotations.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	//precondition
	@BeforeSuite
	public void setUp() {
		System.out.println("Set up System property for chrome");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Open Browser");
	}

	
	@BeforeMethod
	public void enterURL() {
		System.out.println("Enter URL");
	}
	
	@BeforeTest
	public void login() {
		
	}
	
	@Test
	public void googleTitleTest() {
		System.out.println("Google Title");
	}
	
	@AfterMethod
	public void logOut()
	{
		System.out.println("Logout from App");
	}
	
	
	@AfterTest
	public void deleteAllCookies() {
		
		System.out.println("deleteAllCookies");
		
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser");
		
		
	}
	
	@AfterSuite
	public void generatTestReport() {
		System.out.println("generateTestReport");
	}
}
