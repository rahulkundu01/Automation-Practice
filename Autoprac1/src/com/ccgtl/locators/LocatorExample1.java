package com.ccgtl.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExample1 {
	public static WebDriver driver;
	public static String baseURL = "https://mail.rediff.com/cgi-bin/login.cgi";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(baseURL);
		
		driver.findElement(By.id("login1"))
									.sendKeys("User1");
		driver.findElement(By.id("login1")).clear();
		System.out.println(driver.findElement(By.id("login1")).isEnabled());
		System.out.println(driver.findElement(By.id("login1")).isDisplayed());
		

	}

}
