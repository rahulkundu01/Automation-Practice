package com.ccgtl.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorExample02 {
	public static WebDriver driver;
	public static String baseUrl = "https://mail.rediff.com/cgi-bin/login.cgi";
	
	static{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver.get(baseUrl); //Navigate to rediffmail.com
		driver.findElement(By.id("login1"))
										.sendKeys("User1");
		driver.findElement(By.name("passwd"))
										.sendKeys("password"); //Enter password
		driver.findElement(By.className("eye-icon")).click(); // Unmasked the password
		//driver.findElement(By.)
		driver.findElement(By.id("remember")).click(); // uncheck the checkbox
		driver.findElement(By.id("remember")).click(); // check the checkbox
		
		

	}

}
