package com.ccgtl.locators;

import java.util.concurrent.TimeUnit;

/*
 * Program for checking Link Text and Partial Link Text
 * 
 * Synchronization > Thread , implicit wait , Explicit Wait
 * 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExample03 {
	WebDriver driver;
	public String baseUrl = "https://mail.rediff.com/cgi-bin/login.cgi";
	LocatorExample03(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	public void testNav() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);
		System.out.println("Navigate to Rediffmail");
	}
	@SuppressWarnings("deprecation")
	public void testLocators() {
		driver.findElement(By.linkText("Forgot Password?")).click();
		System.out.println("Clicked on Forget password Link");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.navigate().back();
	}
	public void testLocators2() {
		driver.findElement(By.partialLinkText("Password?")).click();
		System.out.println("Clicked on Forget password Link using partial link text");
	}
	public void tearDown() {
		driver.quit();
		System.out.println("Execution completed");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LocatorExample03 le03 = new LocatorExample03();
		le03.testNav();
		le03.testLocators();le03.testLocators2();
		le03.tearDown();

	}

}
