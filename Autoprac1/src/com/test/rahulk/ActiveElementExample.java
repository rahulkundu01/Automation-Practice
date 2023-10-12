package com.test.rahulk;

import org.openqa.selenium.Dimension;

//import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElementExample {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		
		driver.switchTo().activeElement().sendKeys("Selenium");
		
		Dimension dimension = new Dimension(786, 786);
		driver.manage().window().setSize(dimension);
		
		
		//driver.quit();

	}

}
