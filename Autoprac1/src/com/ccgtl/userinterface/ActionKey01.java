package com.ccgtl.userinterface;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionKey01 extends TakeScreenshot {
	public static WebDriver driver;
	public static WebElement element;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		element = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		
		Actions action = new Actions(driver);
		action.keyDown(element, Keys.SHIFT).sendKeys("hi this is test for shift").build().perform();
		screenshot(driver,"enter value");
		action.keyUp(element, Keys.SHIFT).build().perform();
		//action.keyDown(element,Keys.BACK_SPACE).build().perform();
		//action.keyDown(element,Keys.CLEAR).build().perform();
		
		Thread.sleep(2000);
		
		action.keyDown(element,Keys.SPACE).sendKeys("test").build().perform();
		action.keyDown(element,Keys.ENTER).build().perform();
		//action.keyUp(element, Keys.ARROW_DOWN).build().perform();
		screenshot(driver,"search");
		
		/*
		TakesScreenshot ts = ((TakesScreenshot)driver); //declearing
		File srcFile = ts.getScreenshotAs(OutputType.FILE); //taking screen shot as file
		FileUtils.copyFile(srcFile, new File("C:\\selenium_java\\screenshot\\s2.png"));*/
	}
}
