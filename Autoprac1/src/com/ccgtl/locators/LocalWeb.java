package com.ccgtl.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalWeb {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/rahul/OneDrive/documents/website/testrk03.html");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='in1']")).sendKeys("iam back");
		driver.findElement(By.xpath("//a[@id='link1']")).click();

	}

}
