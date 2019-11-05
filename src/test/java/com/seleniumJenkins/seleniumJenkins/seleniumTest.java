package com.seleniumJenkins.seleniumJenkins;

import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class seleniumTest {
	public static WebDriver driver;
	
	@Test
	public void testFacebook() {
		driver.findElement(By.name("q")).sendKeys("Facebook");
		System.out.println("Entering Facebook in google search box");
		if(true){
			
		}
	}
	
	@Test
	public void testNetFlix() {
		driver.findElement(By.name("q")).sendKeys("NetFlix");
		System.out.println("Entering NetFlix in google search box");
		if(true)
			System.out.println("to get checkstyle warning");
	}
	
	@Test
	public void testAmazon() {
		int a=10;
		driver.findElement(By.name("q")).sendKeys("Amazon");
		System.out.println("Entering Amazon in google search box");
	}
	
	@Test
	public void testWalmart() {
		driver.findElement(By.name("q")).sendKeys("Wal-Mart");
		System.out.println("Entering Wal-Mart in google search box");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Opening chrome browser");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		System.out.println("Setup basic WebDriver configurations");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		System.out.println("Navigating to google.com");
		driver.get("https://www.google.com");
		
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Test Finished");
		driver.quit();
	}

	@BeforeClass
	public void beforeClass() {
	System.out.println("Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}

}
